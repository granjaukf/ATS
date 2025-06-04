import Test.QuickCheck
import System.IO

-- Gerador de código para um método @Test da classe Flexoes que testa consumoCalorias
genTestFlexoesConsumo :: Gen String
genTestFlexoesConsumo = do
  freq  <- choose (50 :: Int, 200 :: Int)         -- FC
  tempo <- choose (60 :: Int, 3600 :: Int)        -- tempo em segundos
  reps  <- choose (10 :: Int, 1000 :: Int)        -- nº de repetições
  peso  <- choose (50 :: Int, 120 :: Int)         -- kg
  altura <- choose (150 :: Int, 200 :: Int)       -- cm
  idade <- choose (18 :: Int, 60 :: Int)          -- idade
  genero <- elements ['M', 'F']                   -- género

  let nomeTeste = "testConsumoCalorias_" ++ show reps ++ "_" ++ show tempo ++ "_" ++ show freq
      anoNascimento = 2025 - idade
  return $ unlines
    [ "    @Test"
    , "    public void " ++ nomeTeste ++ "() {"
    , "        Flexoes a = new Flexoes();"
    , "        a.setFreqCardiaca(" ++ show freq ++ ");"
    , "        a.setTempo(LocalTime.ofSecondOfDay(" ++ show tempo ++ "));"
    , "        a.setRepeticoes(" ++ show reps ++ ");"
    , "        Utilizador u = new UtilizadorProfissional(\"Teste\", \"Rua X\", \"teste@mail.com\", " ++ show freq ++ ", " ++ show peso ++ ", " ++ show altura ++ ","
    , "            LocalDate.of(" ++ show anoNascimento ++ ", 1, 1), '" ++ [genero] ++ "');"
    , "        double calorias = a.consumoCalorias(u);"
    , "        assertTrue(calorias >= 0);"
    , "    }"
    ]

main :: IO ()
main = do
  tests <- generate $ vectorOf 100 genTestFlexoesConsumo
  let header = unlines
        [ "import static org.junit.jupiter.api.Assertions.*;"
        , "import org.junit.jupiter.api.Test;"
        , "import java.time.*;"
        , "import com.mycompany.solucao1.Flexoes;"
        , "import com.mycompany.solucao1.Utilizador;"
        , "import com.mycompany.solucao1.UtilizadorProfissional;"
        , ""
        , "public class FlexoesConsumoGeneratedTest {"
        ]
  let footer = "}"
  writeFile "FlexoesConsumoGeneratedTest.java" (header ++ concat tests ++ footer)
  putStrLn "✔️ Ficheiro FlexoesConsumoGeneratedTest.java gerado com sucesso."
