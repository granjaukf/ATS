import Test.QuickCheck
import System.IO

-- Gerador de código para um método @Test da classe Flexoes
genTestFlexoes :: Gen String
genTestFlexoes = do
  freq  <- (choose (50 :: Int, 200 :: Int))         -- FC entre 50 e 200
  tempo <- (choose (60 :: Int, 3600 :: Int))        -- duração em segundos
  reps  <- (choose (10 :: Int, 1000 :: Int))        -- nº de repetições

  let nomeTeste = "testFlexoes_" ++ show reps ++ "_" ++ show tempo ++ "_" ++ show freq
  return $ unlines
    [ "    @Test"
    , "    public void " ++ nomeTeste ++ "() {"
    , "        Flexoes a = new Flexoes();"
    , "        a.setFreqCardiaca(" ++ show freq ++ ");"
    , "        a.setTempo(LocalTime.ofSecondOfDay(" ++ show tempo ++ "));"
    , "        a.setRepeticoes(" ++ show reps ++ ");"
    , "        double fator = a.getFatorRepeticoes(0.5, 0.2);"
    , "        assertTrue(fator >= -5 && fator <= 20);"
    , "    }"
    ]

main :: IO ()
main = do
  tests <- generate $ vectorOf 100 genTestFlexoes
  let header = unlines
        [ "import static org.junit.jupiter.api.Assertions.*;"
        , "import org.junit.jupiter.api.Test;"
        , "import java.time.*;"
        , "import com.mycompany.solucao1.Flexoes;"
        , ""
        , "public class FlexoesGeneratedTest {"
        ]
  let footer = "}"
  writeFile "FlexoesGeneratedTest.java" (header ++ concat tests ++ footer)
  putStrLn "✔️ Ficheiro FlexoesGeneratedTest.java gerado com sucesso."
