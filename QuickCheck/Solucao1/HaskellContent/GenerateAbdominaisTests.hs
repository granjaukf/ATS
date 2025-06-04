import Test.QuickCheck
import System.IO

-- Gerador de código para um método @Test
genTestAbdominais :: Gen String
genTestAbdominais = do
  freq  <- (choose (50 :: Int, 200 :: Int))         -- FC entre 50 e 200
  tempo <- (choose (60 :: Int, 3600 :: Int))        -- duração em segundos
  reps  <- (choose (10 :: Int, 1000 :: Int))        -- nº de repetições

  let nomeTeste = "testAbdominais_" ++ show reps ++ "_" ++ show tempo ++ "_" ++ show freq
  return $ unlines
    [ "    @Test"
    , "    public void " ++ nomeTeste ++ "() {"
    , "        Abdominais a = new Abdominais();"
    , "        a.setFreqCardiaca(" ++ show freq ++ ");"
    , "        a.setTempo(LocalTime.ofSecondOfDay(" ++ show tempo ++ "));"
    , "        a.setRepeticoes(" ++ show reps ++ ");"
    , "        double fator = a.getFatorRepeticoes(1.0, 0.2);"
    , "        assertTrue(fator >= -5 && fator <= 20);"
    , "    }"
    ]

main :: IO ()
main = do
  tests <- generate $ vectorOf 100 genTestAbdominais
  let header = unlines
        [ "import static org.junit.jupiter.api.Assertions.*;"
        , "import org.junit.jupiter.api.Test;"
        , "import java.time.*;"
        , "import com.mycompany.solucao1.Abdominais;"
        , ""
        , "public class AbdominaisGeneratedTest {"
        ]
  let footer = "}"
  writeFile "AbdominaisGeneratedTest.java" (header ++ concat tests ++ footer)
  putStrLn "✔️ Ficheiro AbdominaisGeneratedTest.java gerado com sucesso."
