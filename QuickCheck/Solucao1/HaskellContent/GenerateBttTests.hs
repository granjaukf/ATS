import Test.QuickCheck
import System.IO

-- Gerador de código para um método @Test da classe Btt
genTestBtt :: Gen String
genTestBtt = do
  freq       <- choose (50 :: Int, 200 :: Int)
  tempo      <- choose (60 :: Int, 3600 :: Int)
  distancia  <- choose (0.5 :: Double, 50.0 :: Double)       -- agora com tipo explícito
  altimetria <- choose (0.0 :: Double, 3000.0 :: Double)     -- tipo explícito aqui também

  let nomeTeste = "testBtt_" ++ show (round distancia :: Int) ++ "_" ++ show (round altimetria :: Int) ++ "_" ++ show freq
  return $ unlines
    [ "    @Test"
    , "    public void " ++ nomeTeste ++ "() {"
    , "        Btt a = new Btt();"
    , "        a.setFreqCardiaca(" ++ show freq ++ ");"
    , "        a.setTempo(LocalTime.ofSecondOfDay(" ++ show tempo ++ "));"
    , "        a.setDistancia(" ++ show distancia ++ ");"
    , "        a.setAltimetria(" ++ show altimetria ++ ");"
    , "        double fator = a.getFatorAltimetria();"
    , "        assertTrue(fator >= -5 && fator <= 20);"
    , "    }"
    ]

main :: IO ()
main = do
  tests <- generate $ vectorOf 100 genTestBtt
  let header = unlines
        [ "import static org.junit.jupiter.api.Assertions.*;"
        , "import org.junit.jupiter.api.Test;"
        , "import java.time.*;"
        , "import com.mycompany.solucao1.Btt;"
        , ""
        , "public class BttGeneratedTest {"
        ]
  let footer = "}"
  writeFile "BttGeneratedTest.java" (header ++ concat tests ++ footer)
  putStrLn "✔️ Ficheiro BttGeneratedTest.java gerado com sucesso."
