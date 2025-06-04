import Test.QuickCheck
import System.IO

-- Gerador de código para um método @Test da classe Trail
genTestTrail :: Gen String
genTestTrail = do
  freq  <- choose (50 :: Int, 200 :: Int)          -- frequência cardíaca
  tempo <- choose (60 :: Int, 3600 :: Int)         -- duração em segundos
  dist  <- choose (0.5 :: Double, 50.0 :: Double)  -- distância em km
  alti  <- choose (0.0 :: Double, 2500.0 :: Double) -- altimetria em metros

  let nomeTeste = "testTrail_" ++ show (round dist :: Int) ++ "_" ++ show (round alti :: Int) ++ "_" ++ show tempo ++ "_" ++ show freq
  return $ unlines
    [ "    @Test"
    , "    public void " ++ nomeTeste ++ "() {"
    , "        Trail a = new Trail();"
    , "        a.setFreqCardiaca(" ++ show freq ++ ");"
    , "        a.setTempo(LocalTime.ofSecondOfDay(" ++ show tempo ++ "));"
    , "        a.setDistancia(" ++ show dist ++ ");"
    , "        a.setAltimetria(" ++ show alti ++ ");"
    , "        double fatorHard = a.getFatorHard();"
    , "        double fatorAlt = a.getFatorAltimetria();"
    , "        assertTrue(fatorHard >= 1.15 && fatorHard <= 1.35);"
    , "        assertTrue(fatorAlt >= 0.0);"
    , "    }"
    ]

main :: IO ()
main = do
  tests <- generate $ vectorOf 100 genTestTrail
  let header = unlines
        [ "import static org.junit.jupiter.api.Assertions.*;"
        , "import org.junit.jupiter.api.Test;"
        , "import java.time.*;"
        , "import com.mycompany.solucao1.Trail;"
        , ""
        , "public class TrailGeneratedTest {"
        ]
  let footer = "}"
  writeFile "TrailGeneratedTest.java" (header ++ concat tests ++ footer)
  putStrLn "✔️ Ficheiro TrailGeneratedTest.java gerado com sucesso."
