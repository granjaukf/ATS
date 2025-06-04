import Test.QuickCheck
import System.IO

genTestPlanoTreino :: Int -> Gen String
genTestPlanoTreino idx = do
  freq   <- choose (60 :: Int, 180)
  peso   <- choose (50 :: Int, 100)
  altura <- choose (150 :: Int, 200)
  ano    <- choose (1970 :: Int, 2010)
  mes    <- choose (1 :: Int, 12)
  dia    <- choose (1 :: Int, 28)
  iter   <- choose (1 :: Int, 10)

  let nomeTeste = "testPlanoTreino_" ++ show idx ++ "_" ++ show freq ++ "_" ++ show iter
  return $ unlines
    [ "    @Test"
    , "    public void " ++ nomeTeste ++ "() {"
    , "        UtilizadorAmador u = new UtilizadorAmador(\"Nome\", \"Morada\", \"email@email.com\", "
    ++ show freq ++ ", " ++ show peso ++ ", " ++ show altura ++ ", "
    ++ "LocalDate.of(" ++ show ano ++ ", " ++ show mes ++ ", " ++ show dia ++ "), 'M');"
    , "        PlanoTreino plano = new PlanoTreino(LocalDate.now());"
    , "        Abdominais a = new Abdominais();"
    , "        a.setFreqCardiaca(" ++ show freq ++ ");"
    , "        a.setTempo(LocalTime.of(0, " ++ show iter ++ "));"
    , "        a.setRepeticoes(" ++ show (iter * 5) ++ ");"
    , "        plano.addAtividade(a, " ++ show iter ++ ");"
    , "        double calorias = plano.caloriasDispendidas(u);"
    , "        assertTrue(calorias >= 0);"
    , "    }"
    ]

main :: IO ()
main = do
  testCases <- mapM (\i -> generate (genTestPlanoTreino i)) [1..100]
  let header = unlines
        [ "import static org.junit.jupiter.api.Assertions.*;"
        , "import org.junit.jupiter.api.Test;"
        , "import java.time.*;"
        , "import com.mycompany.solucao1.*;"
        , ""
        , "public class PlanoTreinoGeneratedTest {"
        ]
      footer = "}"
  writeFile "PlanoTreinoGeneratedTest.java" (header ++ concat testCases ++ footer)
  putStrLn "✔️ Ficheiro PlanoTreinoGeneratedTest.java gerado com sucesso sem duplicados."
