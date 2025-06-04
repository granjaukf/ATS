import Test.QuickCheck
import System.IO

-- Gerador de código para um método @Test da classe LegPress
genTestLegPress :: Gen String
genTestLegPress = do
  freq  <- choose (50 :: Int, 200 :: Int)         -- FC entre 50 e 200
  tempo <- choose (60 :: Int, 3600 :: Int)        -- duração em segundos
  reps  <- choose (10 :: Int, 1000 :: Int)        -- nº de repetições
  peso  <- choose (20.0 :: Double, 300.0 :: Double) -- peso em kg

  let nomeTeste = "testLegPress_" ++ show reps ++ "_" ++ show tempo ++ "_" ++ show freq ++ "_" ++ show (round peso :: Int)
  return $ unlines
    [ "    @Test"
    , "    public void " ++ nomeTeste ++ "() {"
    , "        LegPress a = new LegPress();"
    , "        a.setFreqCardiaca(" ++ show freq ++ ");"
    , "        a.setTempo(LocalTime.ofSecondOfDay(" ++ show tempo ++ "));"
    , "        a.setRepeticoes(" ++ show reps ++ ");"
    , "        a.setPeso(" ++ show peso ++ ");"
    , "        double fator = a.getFatorRepeticoes(0.5, 0.2);"
    , "        assertTrue(fator >= -5 && fator <= 20);"
    , "    }"
    ]

main :: IO ()
main = do
  tests <- generate $ vectorOf 100 genTestLegPress
  let header = unlines
        [ "import static org.junit.jupiter.api.Assertions.*;"
        , "import org.junit.jupiter.api.Test;"
        , "import java.time.*;"
        , "import com.mycompany.solucao1.LegPress;"
        , ""
        , "public class LegPressGeneratedTest {"
        ]
  let footer = "}"
  writeFile "LegPressGeneratedTest.java" (header ++ concat tests ++ footer)
  putStrLn "✔️ Ficheiro LegPressGeneratedTest.java gerado com sucesso."
