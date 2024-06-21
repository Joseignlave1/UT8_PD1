import java.lang.reflect.Array;
import java.util.*;

public class PruebaGrafo {

    public static void main(String[] args) {
        /*

              TGrafoDirigido gd = (TGrafoDirigido) UtilGrafos.cargarGrafo("./src/aeropuertos_1.txt","./src/conexiones_1.txt",
                false, TGrafoDirigido.class);

            Object[] etiquetasarray = gd.getEtiquetasOrdenado();

            Double[][] matriz = UtilGrafos.obtenerMatrizCostos(gd.getVertices());
            UtilGrafos.imprimirMatrizMejorado(matriz, gd.getVertices(), "Matriz");
            Double[][] mfloyd = gd.floyd();
            UtilGrafos.imprimirMatrizMejorado(mfloyd, gd.getVertices(), "Matriz luego de FLOYD");
            for (int i = 0; i < etiquetasarray.length; i++) {
                System.out.println("excentricidad de " + etiquetasarray[i] + " : " + gd.obtenerExcentricidad((Comparable) etiquetasarray[i]));
            }
            System.out.println();
            System.out.println("Centro del grafo: " + gd.centroDelGrafo());
         */

//        //Ejercicio 1
//        TGrafoDirigido gd = (TGrafoDirigido) UtilGrafos.cargarGrafo("./src/aeropuertos.txt", "./src/conexiones.txt",
//                false, TGrafoDirigido.class);
//
//        Object[] etiquetasarray = gd.getEtiquetasOrdenado();
//
//        Double[][] matriz = UtilGrafos.obtenerMatrizCostos(gd.getVertices());
//        UtilGrafos.imprimirMatrizMejorado(matriz, gd.getVertices(), "Matriz");
//        Double[][] mfloyd = gd.floyd();
//        UtilGrafos.imprimirMatrizMejorado(mfloyd, gd.getVertices(), "Matriz luego de FLOYD");
//        for (int i = 0; i < etiquetasarray.length; i++) {
//            System.out.println("excentricidad de " + etiquetasarray[i] + " : " + gd.obtenerExcentricidad((Comparable) etiquetasarray[i]));
//        }
//        System.out.println();
//        System.out.println("Centro del grafo: " + gd.centroDelGrafo());
//
//        boolean[][] mWarshall = gd.warshall();
//        UtilGrafos.imprimirMatrizWarshall(mWarshall, gd.getVertices(), "Matriz luego de Warshall");
//
//        gd.bpf();
        /*
             TCaminos todosLosCaminos = gd.todosLosCaminos("Montevideo","Rio_de_Janeiro");

             todosLosCaminos.imprimirCaminosConsolaYCostoTotal();
         */



        /*

        ArrayList<TVertice> vertices = new ArrayList<>();
        ArrayList<TArista> aristas = new ArrayList<>();

        TVertice vertice1 = new TVertice("Artigas");
        TVertice vertice2 = new TVertice("Canelones");
        TVertice vertice3 = new TVertice("Durazno");

        TVertice vertice4 = new TVertice("Florida");
        TVertice vertice5 = new TVertice("Montevideo");
        TVertice vertice6 = new TVertice("Punta del Este");
        TVertice vertice7 = new TVertice("Rocha");
        vertices.add(vertice1);
        vertices.add(vertice2);
        vertices.add(vertice3);
        vertices.add(vertice4);
        vertices.add(vertice5);
        vertices.add(vertice6);
        vertices.add(vertice7);

        TArista arista = new TArista("Artigas", "Rocha", 400);
        TArista arista1 = new TArista("Canelones", "Artigas", 500);
        TArista arista2 = new TArista("Canelones", "Colonia", 200);
        TArista arista3 = new TArista("Canelones", "Durazno", 170);
        TArista arista4 = new TArista("Canelones", "Punta del Este", 90);
        TArista arista5 = new TArista("Colonia", "Montevideo", 180);
        TArista arista6 = new TArista("Montevideo", "Artigas", 700);
        TArista arista7 = new TArista("Montevideo", "Canelones", 30);
        TArista arista8 = new TArista("Montevideo", "Punta del Este", 130);
        TArista arista9 = new TArista("Punta del Este", "Rocha", 90);
        TArista arista10 = new TArista("Rocha", "Montevideo", 270);
        TArista arista11 = new TArista("Florida", "Durazno", 60);

        aristas.add(arista);
        aristas.add(arista1);
        aristas.add(arista2);
        aristas.add(arista3);
        aristas.add(arista4);
        aristas.add(arista5);
        aristas.add(arista6);
        aristas.add(arista7);
        aristas.add(arista8);
        aristas.add(arista9);
        aristas.add(arista10);
        aristas.add(arista11);

        TGrafoDirigido grafoDirigido = new TGrafoDirigido(vertices, aristas);
        Double[][] matriz = UtilGrafos.obtenerMatrizCostos(grafoDirigido.getVertices());
        UtilGrafos.imprimirMatrizMejorado(matriz, grafoDirigido.getVertices(), "matriz Ejercicio 1");

        Double[][] matrizFloyd = grafoDirigido.floyd();
        UtilGrafos.imprimirMatrizMejorado(matrizFloyd, grafoDirigido.getVertices(), "Matriz de costos mínimos FLOYD");
         */

        /*
            Preguntas ejercicio1:

            El costo de volar de Montevideo a Rio de Janeiro es:
            a. 1980.
            b. 3780.-Correcto
            c. 1000.
            d. 980.

            El costo de volar de Montevideo a Curitiba es:
            a. 2580-Correcto
            b. 3780.
            c. 1980.
            d. Ninguna de las anteriores

            3. Los servicios de mantenimiento se instalan en:
            a. Montevideo
            b. Punta del Este
            c. Curitiba -Correcto
            d. Porto Alegre

            Supongo que se referirá al centro el grafo
         */

        /*
          Ejercicio 2:
            Ejecutando esta funcionalidad del programa desarrollado, responde (y verifica manualmente!!!!):
            • ¿Existen conexión(es) entre Montevideo y Curitiba? SI
            • ¿Existen conexión(es) entre Porto Alegre y Santos? SI
         */

        //Ejercicio 3:

        /*
            1)
            TGrafoDirigido gd = (TGrafoDirigido) UtilGrafos.cargarGrafo("./src/aeropuertos.txt","./src/conexiones.txt",
            false, TGrafoDirigido.class);

            Object[] etiquetasarray = gd.getEtiquetasOrdenado();

            Double[][] matriz = UtilGrafos.obtenerMatrizCostos(gd.getVertices());
            UtilGrafos.imprimirMatrizMejorado(matriz, gd.getVertices(), "Matriz");
            Double[][] mfloyd = gd.floyd();
            UtilGrafos.imprimirMatrizMejorado(mfloyd, gd.getVertices(), "Matriz luego de FLOYD");
            for (int i = 0; i < etiquetasarray.length; i++) {
                System.out.println("excentricidad de " + etiquetasarray[i] + " : " + gd.obtenerExcentricidad((Comparable) etiquetasarray[i]));
            }
            System.out.println();
            System.out.println("Centro del grafo: " + gd.centroDelGrafo());

            boolean[][] mWarshall = gd.warshall();
            UtilGrafos.imprimirMatrizWarshall(mWarshall,gd.getVertices(), "Matriz luego de Warshall");

            gd.bpf();

            2)
            El orden de tiempo de ejecución es O(n + m) donde n es el número de vértices y m el número de aristas.

            3)
            Se visitan todos los vértices del grafo siempre y cuándo el grafo sea conexo, si no es conexo se visitarán todos los vértices alcanzables desde el
            vértice inicial(teniendo en cuénta la implementación de bpf que recibe un vértice inicial por parámetro)

            En el caso de que el grafo no sea conexo, lo que haría sería agregar a una lista los vértices alcanzables por visitar, a medida que los voy visitando
            los elimino de la lista, cuándo la lista este vacía, entonces busco los vértices que restan del grafo sin visitar, estos vendrían a ser los vértices del otro
            subgrafo, selecciono otro vértice inicial, los agrego a la lista y  a medida que los voy visitando los elimino, cuándo la lista esté vacía entonces quiere decir que visité el subgrafo restante.

            4)

            Primero iteraría sobre los adyacentes de ese vértice destino, en un bucle que vaya iterando sobre cada vértice su adyacente, guardando en una lista
            las etiquetas de los vértices para así formar el camino, el bucle finalizaría cuándo la etiqueta de uno de los vértices sea igual al vértice de destino
            indicando que se ha completado el camino.

            finalmente devolvería la lista con todos los posibles vértices desde el vértice de origen hasta el vértice de destino.
         */


        /*
                    //Kruskal

        ArrayList<TVertice> vertices = new ArrayList<>();
        vertices.add(new TVertice("Artigas"));
        vertices.add(new TVertice("Canelones"));
        vertices.add(new TVertice("Durazno"));
        vertices.add(new TVertice("Florida"));
        vertices.add(new TVertice("Montevideo"));
        vertices.add(new TVertice("Punta del Este"));
        vertices.add(new TVertice("Rocha"));

        ArrayList<TArista> aristas = new ArrayList<>();
        aristas.add(new TArista("Artigas", "Rocha", 400));
        aristas.add(new TArista("Canelones", "Artigas", 500));
        aristas.add(new TArista("Canelones", "Colonia", 200));
        aristas.add(new TArista("Canelones", "Durazno", 170));
        aristas.add(new TArista("Canelones", "Punta del Este", 90));
        aristas.add(new TArista("Colonia", "Montevideo", 180));
        aristas.add(new TArista("Montevideo", "Artigas", 700));
        aristas.add(new TArista("Montevideo", "Canelones", 30));
        aristas.add(new TArista("Montevideo", "Punta del Este", 130));
        aristas.add(new TArista("Punta del Este", "Rocha", 90));
        aristas.add(new TArista("Rocha", "Montevideo", 270));
        aristas.add(new TArista("Florida", "Durazno", 60));

        TGrafoNoDirigido grafoNoDirigido = new TGrafoNoDirigido(vertices, aristas);

        TGrafoNoDirigido arbolExpansionMinima = grafoNoDirigido.Kruskal();

        System.out.println("Aristas del Árbol de Expansión Mínima:");
        for (TArista arista : arbolExpansionMinima.getLasAristas()) {
            System.out.println(arista.getEtiquetaOrigen() + " - " + arista.getEtiquetaDestino() + " : " + arista.getCosto());
        }
         */

        //KEVIN BACON


//
//        TGrafoNoDirigido grafoNoDirigido = (TGrafoNoDirigido) UtilGrafos.cargarGrafo("./src/actores.csv", "./src/en_pelicula.csv",
//                false, TGrafoNoDirigido.class);
//
//
//        String[] actores = {"John_Goodman", "Tom_Cruise", "Jason_Statham", "Lukas_Haas", "Djimon_Hounsou", "Harrison_Ford"};
//
//        for (String actor : actores) {
//            int numBacon = grafoNoDirigido.numBacon(actor);
//            System.out.println("El número de Bacon de " + actor + " es: " + numBacon);
//        }

        //BEA

//        TGrafoNoDirigido grafoNoDirigido = (TGrafoNoDirigido) UtilGrafos.cargarGrafo("./src/actores.csv", "./src/en_pelicula.csv",
//                false, TGrafoNoDirigido.class);
//
//        String etiquetaOrigen = "Kevin_Bacon";
//        Collection<TVertice> visitadosDesdeOrigen = grafoNoDirigido.bea(etiquetaOrigen);
//
//        System.out.println("Vértices visitados desde " + etiquetaOrigen + ":");
//        for (TVertice vertice : visitadosDesdeOrigen) {
//            System.out.println(vertice.getEtiqueta());
//        }
//
//        Collection<TVertice> visitadosEnTodoElGrafo = grafoNoDirigido.bea();
//
//        System.out.println("Vértices visitados en todo el grafo:");
//        for (TVertice vertice : visitadosEnTodoElGrafo) {
//            System.out.println(vertice.getEtiqueta());
//        }

        //PUNTOS DE ARTICULACIÓN


//        ArrayList<TVertice> vertices = new ArrayList<>();
//        vertices.add(new TVertice("Artigas"));
//        vertices.add(new TVertice("Canelones"));
//        vertices.add(new TVertice("Durazno"));
//        vertices.add(new TVertice("Florida"));
//        vertices.add(new TVertice("Montevideo"));
//        vertices.add(new TVertice("Punta del Este"));
//        vertices.add(new TVertice("Rocha"));
//
//        ArrayList<TArista> aristas = new ArrayList<>();
//        aristas.add(new TArista("Artigas", "Rocha", 400));
//        aristas.add(new TArista("Canelones", "Artigas", 500));
//        aristas.add(new TArista("Canelones", "Colonia", 200));
//        aristas.add(new TArista("Canelones", "Durazno", 170));
//        aristas.add(new TArista("Canelones", "Punta del Este", 90));
//        aristas.add(new TArista("Colonia", "Montevideo", 180));
//        aristas.add(new TArista("Montevideo", "Artigas", 700));
//        aristas.add(new TArista("Montevideo", "Canelones", 30));
//        aristas.add(new TArista("Montevideo", "Punta del Este", 130));
//        aristas.add(new TArista("Punta del Este", "Rocha", 90));
//        aristas.add(new TArista("Rocha", "Montevideo", 270));
//        aristas.add(new TArista("Florida", "Durazno", 60));
//
//        TGrafoNoDirigido grafoNoDirigido = new TGrafoNoDirigido(vertices, aristas);
//
//        LinkedList<TVertice> puntosArticulacion = grafoNoDirigido.puntosArticulacion();
//
//        // Imprimir los puntos de articulación
//        System.out.println("Puntos de articulación en el grafo:");
//        for (TVertice vertice : puntosArticulacion) {
//            System.out.println(vertice.getEtiqueta());
//        }


        //CLASIFICAR ÁRCOS DEL ÁRBOL

        /*
        TVertice vA = new TVertice("A");
        TVertice vB = new TVertice("B");
        TVertice vC = new TVertice("C");
        TVertice vD = new TVertice("D");
        TVertice vE = new TVertice("E");

        TArista aristaAB = new TArista("A", "B", 1);
        TArista aristaAC = new TArista("A", "C", 1);
        TArista aristaBD = new TArista("B", "D", 1);
        TArista aristaCD = new TArista("C", "D", 1);
        TArista aristaDE = new TArista("D", "E", 1);

        Collection<TVertice> vertices = Arrays.asList(vA, vB, vC, vD, vE);
        Collection<TArista> aristas = Arrays.asList(aristaAB, aristaAC, aristaBD, aristaCD, aristaDE);

        TGrafoDirigido grafoDirigido = new TGrafoDirigido(vertices, aristas);


        List<TArista> arcosArbol = new LinkedList<>();
        List<TArista> arcosRetroceso = new LinkedList<>();
        List<TArista> arcosAvance = new LinkedList<>();
        List<TArista> arcosCruzados = new LinkedList<>();

        grafoDirigido.clasificarArcos("A", arcosArbol, arcosRetroceso, arcosAvance, arcosCruzados);

        System.out.println("Arcos de Árbol:");
        for (TArista arista : arcosArbol) {
            System.out.println(arista.getEtiquetaOrigen() + " -> " + arista.getEtiquetaDestino());
        }

        System.out.println("Arcos de Retroceso:");
        for (TArista arista : arcosRetroceso) {
            System.out.println(arista.getEtiquetaOrigen() + " -> " + arista.getEtiquetaDestino());
        }

        System.out.println("Arcos de Avance:");
        for (TArista arista : arcosAvance) {
            System.out.println(arista.getEtiquetaOrigen() + " -> " + arista.getEtiquetaDestino());
        }

        System.out.println("Arcos Cruzados:");
        for (TArista arista : arcosCruzados) {
            System.out.println(arista.getEtiquetaOrigen() + " -> " + arista.getEtiquetaDestino());
        }
         */
//        List<List<TVertice>> componentesFuertementeConexos = grafoDirigido.encontrarComponentesFuertementeConectados();
//
//        System.out.println("Componentes fuertemente conexos del grafo");
//
//        for(List<TVertice> componente : componentesFuertementeConexos) {
//            for(TVertice vertice : componente) {
//                System.out.println(vertice.getEtiqueta() + "");
//            }
//            System.out.println();
//        }
//
//        List<TVertice> ordenTopologico = grafoDirigido.ordenarTopologico();
//
//        System.out.println("Orden topológico del grafo:");
//        for (TVertice vertice : ordenTopologico) {
//            System.out.print(vertice.getEtiqueta() + " ");
//        }


//
//        String[] lineasTareas = ManejadorArchivosGenerico.leerArchivo("src/tareas.txt", false);
//        List<TVertice> vertices = new ArrayList<>();
//        for (String linea : lineasTareas) {
//            String[] partes = linea.split(" ");
//            String etiqueta = partes[1];
//            vertices.add(new TVertice(etiqueta));
//        }
//
//        String[] lineasPrecedencias = ManejadorArchivosGenerico.leerArchivo("./src/precedencias.txt", false);
//        List<TArista> aristas = new ArrayList<>();
//        for (String linea : lineasPrecedencias) {
//            String[] partes = linea.split(" ");
//            String origen = partes[0];
//            String destino = partes[1];
//            aristas.add(new TArista(origen, destino, 1.0));
//        }
//
//        TGrafoDirigido grafoDirigido = new TGrafoDirigido(vertices, aristas);
//
//        LinkedList<String> ordenParcial = grafoDirigido.ordenParcial();
//
//        grafoDirigido.listarTareas(ordenParcial);
//        ManejadorArchivosGenerico.escribirArchivo("orden.txt", ordenParcial.toArray(new String[0]));
//
//        lineasPrecedencias = ManejadorArchivosGenerico.leerArchivo("./src/precedencias2.txt", false);
//        aristas = new ArrayList<>();
//        for (String linea : lineasPrecedencias) {
//            String[] partes = linea.split(" ");
//            String origen = partes[0];
//            String destino = partes[1];
//            aristas.add(new TArista(origen, destino, 1.0));
//        }
//
//        grafoDirigido = new TGrafoDirigido(vertices, aristas);
//        ordenParcial = grafoDirigido.ordenParcial();
//        grafoDirigido.listarTareas(ordenParcial);
//        ManejadorArchivosGenerico.escribirArchivo("orden2.txt", ordenParcial.toArray(new String[0]));



//           String[] lineasTareas = ManejadorArchivosGenerico.leerArchivo("src/tareasTA6.txt", false);
//        List<TVertice> vertices = new ArrayList<>();
//        for (String linea : lineasTareas) {
//            String[] partes = linea.split(",");
//            String etiqueta = partes[0];
//            vertices.add(new TVertice(etiqueta));
//        }
//
//        String[] lineasPrecedencias = ManejadorArchivosGenerico.leerArchivo("src/precedenciasTA6.txt", false);
//        List<TArista> aristas = new ArrayList<>();
//        for (String linea : lineasPrecedencias) {
//            String[] partes = linea.split(",");
//            String origen = partes[0];
//            String destino = partes[1];
//            aristas.add(new TArista(origen, destino, 0));
//        }
//
//        TGrafoDirigido grafoDirigido = new TGrafoDirigido(vertices, aristas);
//
//        LinkedList<String> ordenParcial = grafoDirigido.ordenParcial();
//
//        grafoDirigido.listarTareas(ordenParcial);

        //UT7_TA3

//        TGrafoDirigido gd = (TGrafoDirigido) UtilGrafos.cargarGrafo("./src/aeropuertos.txt", "./src/conexiones.txt",
//                false, TGrafoDirigido.class);
//
//        Object[] etiquetasarray = gd.getEtiquetasOrdenado();
//
//        Double[][] matriz = UtilGrafos.obtenerMatrizCostos(gd.getVertices());
//        UtilGrafos.imprimirMatrizMejorado(matriz, gd.getVertices(), "Matriz");
//        Double[][] mfloyd = gd.floyd();
//        UtilGrafos.imprimirMatrizMejorado(mfloyd, gd.getVertices(), "Matriz luego de FLOYD");
//        for (int i = 0; i < etiquetasarray.length; i++) {
//            System.out.println("excentricidad de " + etiquetasarray[i] + " : " + gd.obtenerExcentricidad((Comparable) etiquetasarray[i]));
//        }
//        System.out.println();
//        System.out.println("Centro del grafo: " + gd.centroDelGrafo());
//
//        boolean[][] mWarshall = gd.warshall();
//        UtilGrafos.imprimirMatrizWarshall(mWarshall, gd.getVertices(), "Matriz luego de Warshall");
//
//        gd.bpf();

//        TGrafoDirigido gd = (TGrafoDirigido) UtilGrafos.cargarGrafo("./src/aeropuertos_1.txt","./src/conexiones_1.txt",
//                false, TGrafoDirigido.class);
//
//        Object[] etiquetasarray = gd.getEtiquetasOrdenado();
//
//        Double[][] matriz = UtilGrafos.obtenerMatrizCostos(gd.getVertices());
//        UtilGrafos.imprimirMatrizMejorado(matriz, gd.getVertices(), "Matriz");
//        Double[][] mfloyd = gd.floyd();
//        UtilGrafos.imprimirMatrizMejorado(mfloyd, gd.getVertices(), "Matriz luego de FLOYD");
//        for (int i = 0; i < etiquetasarray.length; i++) {
//            System.out.println("excentricidad de " + etiquetasarray[i] + " : " + gd.obtenerExcentricidad((Comparable) etiquetasarray[i]));
//        }
//        System.out.println();
//        System.out.println("Centro del grafo: " + gd.centroDelGrafo());
//
//        gd.bpfConEtiquetaVerticeInicial("Asuncion");


//        TGrafoDirigido gd = (TGrafoDirigido) UtilGrafos.cargarGrafo("./src/aeropuertos_2.txt", "./src/conexiones_2.txt",
//                false, TGrafoDirigido.class);
//
//        Object[] etiquetasarray = gd.getEtiquetasOrdenado();
//
//        Double[][] matriz = UtilGrafos.obtenerMatrizCostos(gd.getVertices());
//        UtilGrafos.imprimirMatrizMejorado(matriz, gd.getVertices(), "Matriz");
//        Double[][] mfloyd = gd.floyd();
//        UtilGrafos.imprimirMatrizMejorado(mfloyd, gd.getVertices(), "Matriz luego de FLOYD");
//        for (int i = 0; i < etiquetasarray.length; i++) {
//            System.out.println("excentricidad de " + etiquetasarray[i] + " : " + gd.obtenerExcentricidad((Comparable) etiquetasarray[i]));
//        }
//        System.out.println();
//        System.out.println("Centro del grafo: " + gd.centroDelGrafo());
//
//        TCaminos todosLosCaminos = gd.todosLosCaminos("Buenos_Aires","Montevideo");
//
//        todosLosCaminos.imprimirCaminosConsolaYCostoTotal();
//
//
//        TCamino caminoCritico = todosLosCaminos.caminoCritico();
//        System.out.println("Camino crítico: " + caminoCritico.imprimirEtiquetas());
//        System.out.println("Costo total del camino crítico: " + caminoCritico.getCostoTotal());
//
//        todosLosCaminos.imprimirHolgurasConsola();



      //Ejercicio 1
     /*
        TVertice verticeA = new TVertice("A");
     TVertice verticeB = new TVertice("B");
     TVertice verticeC = new TVertice("C");
     TVertice verticeD = new TVertice("D");
     TVertice verticeE = new TVertice("E");

     TArista aristaAB = new TArista("A", "B", 1);
     TArista aristaAC = new TArista("A", "C", 1);
     TArista aristaBD = new TArista("B", "D", 1);
     TArista aristaBE = new TArista("B", "E", 1);
     TArista aristaCD = new TArista("C", "D", 1);
     TArista aristaCE = new TArista("C", "E", 1);

     List<TVertice> vertices = new ArrayList<>();
     vertices.add(verticeA);
     vertices.add(verticeB);
     vertices.add(verticeC);
     vertices.add(verticeD);
     vertices.add(verticeE);

     List<TArista> aristas = new ArrayList<>();
     aristas.add(aristaAB);
     aristas.add(aristaAC);
     aristas.add(aristaBD);
     aristas.add(aristaBE);
     aristas.add(aristaCD);
     aristas.add(aristaCE);

     TGrafoNoDirigido grafoNoDirigido = new TGrafoNoDirigido(vertices, aristas);

     for (TVertice vertice : vertices) {
      vertice.setVisitado(false);
     }

     grafoNoDirigido.bpfConEtiquetaVerticeInicial("A");
     System.out.println("Vértices visitados desde A:");
      */



     /*
      TVertice verticeA = new TVertice("A");
     TVertice verticeB = new TVertice("B");
     TVertice verticeC = new TVertice("C");
     TVertice verticeD = new TVertice("D");
     TVertice verticeE = new TVertice("E");
     TVertice verticeF = new TVertice("F");

     TArista aristaAB = new TArista("A", "B", 1);
     TArista aristaAC = new TArista("A", "C", 1);
     TArista aristaBD = new TArista("B", "D", 1);
     TArista aristaBE = new TArista("B", "E", 1);
     TArista aristaCF = new TArista("C", "F", 1);

     List<TVertice> vertices = new ArrayList<>();
     vertices.add(verticeA);
     vertices.add(verticeB);
     vertices.add(verticeC);
     vertices.add(verticeD);
     vertices.add(verticeE);
     vertices.add(verticeF);

     List<TArista> aristas = new ArrayList<>();
     aristas.add(aristaAB);
     aristas.add(aristaAC);
     aristas.add(aristaBD);
     aristas.add(aristaBE);
     aristas.add(aristaCF);

     TGrafoNoDirigido grafoNoDirigido = new TGrafoNoDirigido(vertices, aristas);


     System.out.println("Vértices visitados desde A:");
     grafoNoDirigido.bpfConEtiquetaVerticeInicial("A");
      */
//     TVertice verticeA = new TVertice("A");
//     TVertice verticeB = new TVertice("B");
//     TVertice verticeC = new TVertice("C");
//     TVertice verticeD = new TVertice("D");
//
//     TArista aristaAB = new TArista("A", "B", 1);
//     TArista aristaAC = new TArista("A", "C", 3);
//     TArista aristaBC = new TArista("B", "C", 2);
//     TArista aristaBD = new TArista("B", "D", 4);
//     TArista aristaCD = new TArista("C", "D", 5);
//
//     Collection<TVertice> vertices = new ArrayList<>();
//     vertices.add(verticeA);
//     vertices.add(verticeB);
//     vertices.add(verticeC);
//     vertices.add(verticeD);
//
//     LinkedList<TArista> aristas = new LinkedList<>();
//     aristas.add(aristaAB);
//     aristas.add(aristaAC);
//     aristas.add(aristaBC);
//     aristas.add(aristaBD);
//     aristas.add(aristaCD);
//
//     TGrafoNoDirigido grafo = new TGrafoNoDirigido(vertices, aristas);
//
//     TGrafoNoDirigido aam = grafo.Prim();
//
//     for (TArista arista : aam.getLasAristas()) {
//      System.out.println(arista.etiquetaOrigen + " - " + arista.etiquetaDestino + " : " + arista.getCosto());
//     }

//     TVertice verticeA = new TVertice("A");
//     TVertice verticeB = new TVertice("B");
//     TVertice verticeC = new TVertice("C");
//     TVertice verticeD = new TVertice("D");
//     TVertice verticeE  = new TVertice("E");
//
//     TArista aristaAB = new TArista("A", "B", 1);
//     TArista aristaAC = new TArista("A", "C", 4);
//     TArista aristaBC = new TArista("B", "C", 2);
//     TArista aristaBD = new TArista("B", "D", 5);
//     TArista aristaCD = new TArista("C", "D", 3);
//     TArista aristaCE = new TArista("C", "E", 4);
//     TArista aristaDE = new TArista("D", "E", 2);
//
//     Collection<TVertice> vertices = new ArrayList<>();
//     vertices.add(verticeA);
//     vertices.add(verticeB);
//     vertices.add(verticeC);
//     vertices.add(verticeD);
//     vertices.add(verticeE);
//
//     LinkedList<TArista> aristas = new LinkedList<>();
//     aristas.add(aristaAB);
//     aristas.add(aristaAC);
//     aristas.add(aristaBC);
//     aristas.add(aristaBD);
//     aristas.add(aristaCD);
//     aristas.add(aristaCE);
//     aristas.add(aristaDE);
//     TGrafoNoDirigido grafo = new TGrafoNoDirigido(vertices, aristas);
//
//     TGrafoNoDirigido aam = grafo.Prim();
//
//     for (TArista arista : aam.getLasAristas()) {
//      System.out.println(arista.etiquetaOrigen + " - " + arista.etiquetaDestino + " : " + arista.getCosto());
//     }

        TVertice verticeB = new TVertice("B");
        TVertice verticeD = new TVertice("D");
        TVertice verticeE = new TVertice("E");
        TVertice verticeA = new TVertice("A");
        TVertice verticeC  = new TVertice("C");
        TVertice verticeF  = new TVertice("F");
        TVertice verticeG  = new TVertice("G");

        TArista aristaBD = new TArista("B", "D", 0);
        TArista aristaBE = new TArista("B", "E", 0);
        TArista aristaBA = new TArista("B", "A", 0);
        TArista aristaEC = new TArista("E", "C", 0);
        TArista aristaCF = new TArista("C", "F", 0);
        TArista aristaCG = new TArista("C", "G", 0);

        Collection<TVertice> vertices = new ArrayList<>();
        vertices.add(verticeA);
        vertices.add(verticeB);
        vertices.add(verticeC);
        vertices.add(verticeD);
        vertices.add(verticeE);
        vertices.add(verticeF);
        vertices.add(verticeG);

        LinkedList<TArista> aristas = new LinkedList<>();
        aristas.add(aristaBD);
        aristas.add(aristaBE);
        aristas.add(aristaBA);
        aristas.add(aristaEC);
        aristas.add(aristaCF);
        aristas.add(aristaCG);

        TGrafoNoDirigido grafo = new TGrafoNoDirigido(vertices, aristas);

        Collection<TVertice> bosqueAbarcador = grafo.beaDesdeVerticeInicial("B");

        for (TVertice vertice : bosqueAbarcador) {
            System.out.println(vertice.getEtiqueta());
        }

    }
}
