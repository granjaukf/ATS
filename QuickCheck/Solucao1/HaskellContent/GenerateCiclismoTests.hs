import Test.QuickCheck
import System.IO

-- Gerador de código para um método @Test da classe Ciclismo
genTestCiclismo :: Gen String
genTestCiclismo = do
  freq  <- choose (50 :: Int, 200 :: Int)         -- FC entre 50 e 200
  tempo <- choose (60 :: Int, 3600 :: Int)        -- duração em segundos
  dist  <- choose (0.1 :: Double, 100.0 :: Double) -- distância em km

  let nomeTeste = "testCiclismo_" ++ show (round dist :: Int) ++ "_" ++ show tempo ++ "_" ++ show freq
  return $ unlines
    [ "    @Test"
    , "    public void " ++ nomeTeste ++ "() {"
    , "        Ciclismo a = new Ciclismo();"
    , "        a.setFreqCardiaca(" ++ show freq ++ ");"
    , "        a.setTempo(LocalTime.ofSecondOfDay(" ++ show tempo ++ "));"
    , "        a.setDistancia(" ++ show dist ++ ");"
    , "        double fator = a.getFatorVelocidade(10.5, 0.11);"
    , "        assertTrue(fator >= -5 && fator <= 20);"
    , "    }"
    ]

main :: IO ()
main = do
  tests <- generate $ vectorOf 100 genTestCiclismo
  let header = unlines
        [ "import static org.junit.jupiter.api.Assertions.*;"
        , "import org.junit.jupiter.api.Test;"
        , "import java.time.*;"
        , "import com.mycompany.solucao1.Ciclismo;"
        , ""
        , "public class CiclismoGeneratedTest {"
        ]
  let footer = "}"
  writeFile "CiclismoGeneratedTest.java" (header ++ concat tests ++ footer)
  putStrLn "✔️ Ficheiro CiclismoGeneratedTest.java gerado com sucesso."
