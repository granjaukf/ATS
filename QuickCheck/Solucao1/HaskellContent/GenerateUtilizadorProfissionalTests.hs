import Test.QuickCheck
import System.IO

genTestProf :: Gen String
genTestProf = do
  freq   <- choose (50 :: Int, 200)
  peso   <- choose (45 :: Int, 120)
  altura <- choose (140 :: Int, 210)
  ano    <- choose (1970 :: Int, 2010)
  mes    <- choose (1 :: Int, 12)
  dia    <- choose (1 :: Int, 28)
  genero <- elements ['M', 'F']

  let nomeTeste = "testUtilizadorProf_" ++ show freq ++ "_" ++ show peso ++ "_" ++ show altura
  return $ unlines
    [ "    @Test"
    , "    public void " ++ nomeTeste ++ "() {"
    , "        UtilizadorProfissional u = new UtilizadorProfissional("
    , "            \"Teste\", \"Rua Exemplo\", \"email@example.com\", "
    ++ show freq ++ ", " ++ show peso ++ ", " ++ show altura ++ ", "
    ++ "LocalDate.of(" ++ show ano ++ ", " ++ show mes ++ ", " ++ show dia ++ "), '" ++ [genero] ++ "');"
    , "        assertEquals(1.5, u.getFatorMultiplicativo(), 0.01);"
    , "    }"
    ]

main :: IO ()
main = do
  tests <- generate $ vectorOf 100 genTestProf
  let header = unlines
        [ "import static org.junit.jupiter.api.Assertions.*;"
        , "import org.junit.jupiter.api.Test;"
        , "import java.time.*;"
        , "import com.mycompany.solucao1.UtilizadorProfissional;"
        , ""
        , "public class UtilizadorProfissionalGeneratedTest {"
        ]
      footer = "}"
  writeFile "UtilizadorProfissionalGeneratedTest.java" (header ++ concat tests ++ footer)
  putStrLn "✔️ Ficheiro UtilizadorProfissionalGeneratedTest.java gerado com sucesso."
