import Test.QuickCheck
import System.IO

-- Gerador de código para um método @Test da classe Corrida
genTestCorrida :: Gen String
genTestCorrida = do
  freq  <- choose (50 :: Int, 200 :: Int)         -- FC entre 50 e 200
  tempo <- choose (60 :: Int, 3600 :: Int)        -- duração em segundos
  dist  <- choose (0.1 :: Double, 30.0 :: Double) -- distância em km

  let nomeTeste = "testCorrida_" ++ show (round dist :: Int) ++ "_" ++ show tempo ++ "_" ++ show freq
  return $ unlines
    [ "    @Test"
    , "    public void " ++ nomeTeste ++ "() {"
    , "        Corrida a = new Corrida();"
    , "        a.setFreqCardiaca(" ++ show freq ++ ");"
    , "        a.setTempo(LocalTime.ofSecondOfDay(" ++ show tempo ++ "));"
    , "        a.setDistancia(" ++ show dist ++ ");"
    , "        double fator = a.getFatorVelocidade(2.2, 0.22);"
    , "        assertTrue(fator >= -5 && fator <= 20);"
    , "    }"
    ]

main :: IO ()
main = do
  tests <- generate $ vectorOf 100 genTestCorrida
  let header = unlines
        [ "import static org.junit.jupiter.api.Assertions.*;"
        , "import org.junit.jupiter.api.Test;"
        , "import java.time.*;"
        , "import com.mycompany.solucao1.Corrida;"
        , ""
        , "public class CorridaGeneratedTest {"
        ]
  let footer = "}"
  writeFile "CorridaGeneratedTest.java" (header ++ concat tests ++ footer)
  putStrLn "✔️ Ficheiro CorridaGeneratedTest.java gerado com sucesso."
