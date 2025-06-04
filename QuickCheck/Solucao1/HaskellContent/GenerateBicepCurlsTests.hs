import Test.QuickCheck
import System.IO

-- Gerador de código para um método @Test da classe BicepCurls
genTestBicepCurls :: Gen String
genTestBicepCurls = do
  freq  <- choose (50 :: Int, 200 :: Int)
  tempo <- choose (60 :: Int, 3600 :: Int)
  reps  <- choose (10 :: Int, 1000 :: Int)
  peso  <- choose (2.0 :: Double, 80.0 :: Double)

  let nomeTeste = "testBicepCurls_" ++ show reps ++ "_" ++ show tempo ++ "_" ++ show freq ++ "_" ++ show (round peso :: Int)
  return $ unlines
    [ "    @Test"
    , "    public void " ++ nomeTeste ++ "() {"
    , "        BicepCurls a = new BicepCurls();"
    , "        a.setFreqCardiaca(" ++ show freq ++ ");"
    , "        a.setTempo(LocalTime.ofSecondOfDay(" ++ show tempo ++ "));"
    , "        a.setRepeticoes(" ++ show reps ++ ");"
    , "        a.setPeso(" ++ show peso ++ ");"
    , "        double fator = a.getFatorRepeticoes(0.5, 0.4);"
    , "        assertTrue(fator >= -5 && fator <= 20);"
    , "    }"
    ]

main :: IO ()
main = do
  tests <- generate $ vectorOf 100 genTestBicepCurls
  let header = unlines
        [ "import static org.junit.jupiter.api.Assertions.*;"
        , "import org.junit.jupiter.api.Test;"
        , "import java.time.*;"
        , "import com.mycompany.solucao1.BicepCurls;"
        , ""
        , "public class BicepCurlsGeneratedTest {"
        ]
  let footer = "}"
  writeFile "BicepCurlsGeneratedTest.java" (header ++ concat tests ++ footer)
  putStrLn "✔️ Ficheiro BicepCurlsGeneratedTest.java gerado com sucesso."
