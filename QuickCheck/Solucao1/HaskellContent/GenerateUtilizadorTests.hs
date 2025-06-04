-- GenerateUtilizadorTests.hs
import System.Random
import Control.Monad (replicateM)
import Data.List (intercalate)

-- Utilizador base

main :: IO ()
main = do
  putStrLn "import static org.junit.jupiter.api.Assertions.*;"
  putStrLn "import org.junit.jupiter.api.Test;"
  putStrLn "import Utilizador;"
  putStrLn "import UtilizadorAmador;"
  putStrLn "import UtilizadorPraticanteOcasional;"
  putStrLn "import UtilizadorProfissional;"
  putStrLn ""
  putStrLn "public class UtilizadorGeneratedTest {"
  tests <- replicateM 100 genTest
  putStrLn $ intercalate "\n\n" tests
  putStrLn "}"

genTest :: IO String
genTest = do
  idade <- choose (18 :: Int, 60)
  peso <- choose (45.0, 120.0) :: IO Double
  altura <- choose (1.4, 2.0) :: IO Double
  tipo <- choose (0 :: Int, 3)
  let sexo = if odd idade then "'F'" else "'M'"
      nome = "testU_" ++ show idade ++ "_" ++ show (round peso) ++ "_" ++ show (round (altura * 100)) ++ "_" ++ show tipo
      className = case tipo of
                    0 -> "Utilizador"
                    1 -> "UtilizadorAmador"
                    2 -> "UtilizadorPraticanteOcasional"
                    _ -> "UtilizadorProfissional"
      fator = case tipo of
                0 -> 1.0
                1 -> 1.1
                2 -> 1.25
                _ -> 1.5
      fcrep = show $ round $ fator * fromIntegral (220 - idade)
      imc = show $ round $ fator * peso / (altura * altura)
  return $ unlines
    [ "    @Test"
    , "    public void " ++ nome ++ "() {"
    , "        " ++ className ++ " u = new " ++ className ++ "();"
    , "        u.setIdade(" ++ show idade ++ ");"
    , "        u.setSexo(" ++ sexo ++ ");"
    , "        u.setPeso(" ++ show peso ++ ");"
    , "        u.setAltura(" ++ show altura ++ ");"
    , "        assertEquals(" ++ fcrep ++ ", u.getFrequenciaCardiacaMaxima());"
    , "        assertEquals(" ++ imc ++ ", Math.round(u.calculaIMC()));"
    , "    }"
    ]

choose :: Random a => (a, a) -> IO a
choose range = getStdRandom (randomR range)
