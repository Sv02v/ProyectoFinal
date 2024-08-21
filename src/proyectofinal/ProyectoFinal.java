/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectofinal;

import javax.swing.JOptionPane;

/**
 *
 * @author sebastian
 */
public class ProyectoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             boolean continuar = true;
        while (continuar) {
            // Menú principal
            String[] opcionesMenuPrincipal = {
                "Gestionar Visitantes",
                "Gestionar Habitats",
                "Gestionar Eventos",
                "Registrar Alimentacion",
                "Mostrar Mapa",
                "Salir"
            };
            int opcionPrincipal = JOptionPane.showOptionDialog(
                    null,
                    "***MENu PRINCIPAL***",
                    "Sistema de Gestion del Zoologico",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opcionesMenuPrincipal,
                    opcionesMenuPrincipal[0]
            );
            switch (opcionPrincipal) {
                case 0: {
                    gestionarVisitantes();
                    break;
                }
                case 1: {
                    gestionarHabitats();
                    break;
                }
                case 2: {
                    gestionarEventos();
                    break;
                }
                case 3: {
                    registrarAlimentacion();
                    break;
                }
                case 4: {
                    new ZoologicoGUI();
                    break;
                }
                case 5: {
                    JOptionPane.showMessageDialog(null, "Saliendo del programa. ¡Hasta luego!");
                    continuar = false;
                    break;
                }
                default: {
                    JOptionPane.showMessageDialog(null, "¡Opcion incorrecta!");
                }
            }
        }
    }

    private static void gestionarVisitantes() {
// Instancia de la clase RegistroVisitantes
        // Instancia de la clase RegistroVisitantes
        RegistroVisitantes registro = new RegistroVisitantes();

        // Cadenas que contienen las opciones del menu
        String[] opciones = {"Agregar visitante", "Mostrar visitantes", "Mostrar estadísticas", "Salir"};

        int opcion = -1; // Inicializamos con un valor que no sea valido

        // Bucle while
        while (opcion != 3) {
            // Mostrar el menu y obtener la opcion seleccionada
            opcion = JOptionPane.showOptionDialog(
                    null,
                    "Seleccione una opcion:",
                    "Menu de Registro de Visitantes",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]
            );

            // Ejecutar acción basada en la opción seleccionada
            switch (opcion) {
                case 0:
                    registro.agregarVisitante();
                    JOptionPane.showMessageDialog(null, "Visitante agregado exitosamente.");
                    break;
                case 1:
                    registro.mostrarVisitantes();
                    break;
                case 2:
                    registro.mostrarEstadísticas();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida. Por favor, intente de nuevo.");
                    break;
            }
        }
    }

    private static void gestionarHabitats() {
        // Creamos una instancia de la clase GestionHabitats para manejar los habitats
     boolean continuar = true;
        while (continuar) {
            // Menú principal
            String[] opcionesMenuPrincipal = {
                "Gestionar Visitantes",
                "Gestionar Habitats",
                "Gestionar Eventos",
                "Registrar Alimentacion",
                "Mostrar Mapa",
                "Salir"
            };
            int opcionPrincipal = JOptionPane.showOptionDialog(
                    null,
                    "***MENu PRINCIPAL***",
                    "Sistema de Gestion del Zoologico",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opcionesMenuPrincipal,
                    opcionesMenuPrincipal[0]
            );
            switch (opcionPrincipal) {
                case 0: {
                    gestionarVisitantes();
                    break;
                }
                case 1: {
                    gestionarHabitats();
                    break;
                }
                case 2: {
                    gestionarEventos();
                    break;
                }
                case 3: {
                    registrarAlimentacion();
                    break;
                }
                case 4: {
                    new ZoologicoGUI();
                    break;
                }
                case 5: {
                    JOptionPane.showMessageDialog(null, "Saliendo del programa. ¡Hasta luego!");
                    continuar = false;
                    break;
                }
                default: {
                    JOptionPane.showMessageDialog(null, "¡Opcion incorrecta!");
                }
            }
        }
    }

    private static void gestionarVisitantes() {
// Instancia de la clase RegistroVisitantes
        // Instancia de la clase RegistroVisitantes
        RegistroVisitantes registro = new RegistroVisitantes();

        // Cadenas que contienen las opciones del menu
        String[] opciones = {"Agregar visitante", "Mostrar visitantes", "Mostrar estadísticas", "Salir"};

        int opcion = -1; // Inicializamos con un valor que no sea valido

        // Bucle while
        while (opcion != 3) {
            // Mostrar el menu y obtener la opcion seleccionada
            opcion = JOptionPane.showOptionDialog(
                    null,
                    "Seleccione una opcion:",
                    "Menu de Registro de Visitantes",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]
            );

            // Ejecutar acción basada en la opción seleccionada
            switch (opcion) {
                case 0:
                    registro.agregarVisitante();
                    JOptionPane.showMessageDialog(null, "Visitante agregado exitosamente.");
                    break;
                case 1:
                    registro.mostrarVisitantes();
                    break;
                case 2:
                    registro.mostrarEstadísticas();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida. Por favor, intente de nuevo.");
                    break;
            }
        }
    }

    private static void gestionarHabitats() {
        // Creamos una instancia de la clase GestionHabitats para manejar los habitats
        GestionHabitats gestionHabitats = new GestionHabitats();
        boolean continuar = true; // Variable para controlar el bucle del menú

        // Bucle que se ejecuta mientras el usuario quiera seguir usando el sistema
        while (continuar) {
            // Mostramos un menú al usuario y le pedimos que seleccione una opción
            String opcionMenu = JOptionPane.showInputDialog(
                    "Seleccione una opcion:\n"
                    + "1. Agregar Habitat\n"
                    + "2. Consultar Habitats\n"
                    + "3. Modificar Habitat\n"
                    + "4. Eliminar Habitat\n"
                    + "5. Salir"
            );

            // Usamos un switch para manejar la opción seleccionada por el usuario
            switch (opcionMenu) {
                case "1":
                    // Si el usuario selecciona "1", llamamos al método para agregar un nuevo habitat
                    gestionHabitats.agregarHabitat();
                    break;
                case "2":
                    // Si el usuario selecciona "2", llamamos al método para consultar todos los habitats
                    gestionHabitats.consultarHabitats();
                    break;
                case "3":
                    // Si el usuario selecciona "3", llamamos al método para modificar un habitat existente
                    gestionHabitats.modificarHabitat();
                    break;
                case "4":
                    // Si el usuario selecciona "4", llamamos al método para eliminar un habitat
                    gestionHabitats.eliminarHabitat();
                    break;
                case "5":
                    // Si el usuario selecciona "5", salimos del bucle y terminamos el programa
                    continuar = false;
                    break;
                default:
                    // Si la opción ingresada no es valida, mostramos un mensaje de error
                    JOptionPane.showMessageDialog(null, "Opción no valida. Intente de nuevo.");
                    break;
            }
        }

        // Cuando el bucle termina, mostramos un mensaje de despedida
        JOptionPane.showMessageDialog(null, "Gracias por usar el sistema de gestión de habitats.");

        // Llamada a la función para gestionar eventos
        gestionarEventos();

        // Llamada a la función para registrar alimentación
        registrarAlimentacion();
    }

    private static void gestionarEventos() {
        Evento[] eventos = new Evento[10];
        int numEventos = 0;
        String[] opciones = {"Agregar Evento", "Ver Eventos", "Modificar Evento", "Eliminar Evento", "Volver"};
        int opcion = -1;

        while (opcion != 4) { // "Volver"
            opcion = JOptionPane.showOptionDialog(
                    null,
                    "Seleccione una opción:",
                    "Gestión de Eventos",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]
            );

            switch (opcion) {
                case 0:
                    if (numEventos < eventos.length) {
                        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del evento:");
                        String fecha = JOptionPane.showInputDialog("Ingrese la fecha del evento (YYYY-MM-DD):");
                        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del evento:"));
                        String descripcion = JOptionPane.showInputDialog("Ingrese la descripción del evento:");
                        String localizacion = JOptionPane.showInputDialog("Ingrese la localización del evento:");
                        eventos[numEventos++] = new Evento(nombre, fecha, id, descripcion, localizacion);
                    } else {
                        JOptionPane.showMessageDialog(null, "Se ha alcanzado el límite maximo de eventos.");
                    }
                    break;
                case 2:
                    int idModificar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del evento a modificar:"));
                    boolean encontrado = false;
                    for (int i = 0; i < numEventos; i++) {
                        if (eventos[i].getId() == idModificar) {
                            String nuevoNombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre del evento:");
                            String nuevaFecha = JOptionPane.showInputDialog("Ingrese la nueva fecha del evento (YYYY-MM-DD):");
                            String nuevaDescripcion = JOptionPane.showInputDialog("Ingrese la nueva descripción del evento:");
                            String nuevaLocalizacion = JOptionPane.showInputDialog("Ingrese la nueva localización del evento:");

                            eventos[i].setNombre(nuevoNombre);
                            eventos[i].setFecha(nuevaFecha);
                            eventos[i].setDescripcion(nuevaDescripcion);
                            eventos[i].setLocalizacion(nuevaLocalizacion);

                            encontrado = true;
                            JOptionPane.showMessageDialog(null, "Evento modificado con éxito.");
                            break;
                        }
                    }
                    if (!encontrado) {
                        JOptionPane.showMessageDialog(null, "No se encontró ningún evento con ese ID.");
                    }
                    break;
                case 3:
                    int idEliminar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del evento a eliminar:"));
                    encontrado = false;
                    for (int i = 0; i < numEventos; i++) {
                        if (eventos[i].getId() == idEliminar) {
                            for (int j = i; j < numEventos - 1; j++) {
                                eventos[j] = eventos[j + 1];
                            }
                            eventos[--numEventos] = null;
                            encontrado = true;
                            JOptionPane.showMessageDialog(null, "Evento eliminado con éxito.");
                            break;
                        }
                    }
                    if (!encontrado) {
                        JOptionPane.showMessageDialog(null, "No se encontró ningún evento con ese ID.");
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción invalida. Por favor, intente de nuevo.");
                    break;
            }
        }
    }

    private static void registrarAlimentacion() {
        int RegistroAlimentacion = 0;
        boolean entradaValida = false;

         // Registro precargados
            Alimentacion[] registrosPrecargados = {
        new Alimentacion("León", "7:00 am", "Carne", "8 horas", 10),
        new Alimentacion("Elefante", "12:00 pm", "Vegetales", "1 día", 300),
        new Alimentacion("Hiena", "7:00 pm", "Carne", "8 horas", 8)
    };

    int registrosExistentes = registrosPrecargados.length;

    // Mostramos los registros precargados
    for (int i = 0; i < registrosExistentes; i++) {
        JOptionPane.showMessageDialog(null,
                "Registro " + (i + 1) +
                "\nAnimal: " + registrosPrecargados[i].getNombreanimal() +
                "\nHora de alimentación: " + registrosPrecargados[i].getHorario() +
                "\nEste animal consume: " + registrosPrecargados[i].getAlimentos() +
                "\nEste animal come cada: " + registrosPrecargados[i].getFrecuenciaalimentacion() +
                "\nEste animal come (kilos): " + registrosPrecargados[i].getCantidadalimento());
    }


        // Validación de la cantidad de registros
        do {
            try {
                String input = JOptionPane.showInputDialog(null, "Ingrese la cantidad de registros que desea crear (1-10): ");
                if (input != null && !input.trim().isEmpty()) {
                    RegistroAlimentacion = Integer.parseInt(input);
                    if (RegistroAlimentacion > 0 && RegistroAlimentacion <= 10) {
                        entradaValida = true;
                    } else {
                        JOptionPane.showMessageDialog(null, "Por favor, ingrese un número entre 1 y 10.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El valor ingresado no puede estar vacío.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un número valido.");
            }
        } while (!entradaValida);

        Alimentacion[] arrAlimentacion = new Alimentacion[RegistroAlimentacion];

        // Se creo un bucle que depende de la cantidad de registros
        for (int i = 0; i < RegistroAlimentacion; i++) {
            entradaValida = false;  // Se reinicia para cada nuevo registro

            // Solicitamos nombre del animal
            String nombreanimal = JOptionPane.showInputDialog(null, "Ingrese el nombre del animal para el registro " + (i + 1) + ": ");

            // Selección de horario
            String[] opcioneshorario = {"7:00 am", "12:00 pm", "7:00 pm"};
            int opcionH = JOptionPane.showOptionDialog(
                    null,
                    "Seleccione una hora:",
                    "Horarios",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opcioneshorario,
                    opcioneshorario[0]
            );
            String horario = opcioneshorario[opcionH];
// Selección de tipo de alimento
            String[] opcionesAlimentos = {"Frutas", "Vegetales", "Carne", "Pescado"};
            int opcionA = JOptionPane.showOptionDialog(
                    null,
                    "Seleccione un tipo de Alimento:",
                    "Alimentos",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opcionesAlimentos,
                    opcionesAlimentos[0]
            );
            String alimentos = opcionesAlimentos[opcionA];

            // Selección de frecuencia de alimentación
            String[] opcionesFrecuencia = {"5 horas", "8 horas", "1 día"};
            int opcionF = JOptionPane.showOptionDialog(
                    null,
                    "Seleccione la frecuencia de alimentación:",
                    "Frecuencias",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opcionesFrecuencia,
                    opcionesFrecuencia[0]
            );
            String frecuenciaalimentacion = opcionesFrecuencia[opcionF];

            // Validación para determinar la cantidad de alimento
            double cantidadAlimento = 0;
            do {
                try {
                    String input = JOptionPane.showInputDialog(null, "Ingrese la cantidad de alimento en kg para el registro " + (i + 1) + ": ");
                    if (input != null && !input.trim().isEmpty()) {  // Verificamos que la entrada no esté vacía
                        cantidadAlimento = Double.parseDouble(input);
                        if (cantidadAlimento > 0) {  // Aseguramos que la cantidad sea un número positivo
                            entradaValida = true;  // Establecemos que la entrada es valida
                        } else {
                            JOptionPane.showMessageDialog(null, "Por favor, ingrese un valor positivo.");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "El valor ingresado no puede estar vacío.");
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese un número valido.");
                }
            } while (!entradaValida);

            // Creamos y almacenamos el objeto Alimentacion
            arrAlimentacion[i] = new Alimentacion(nombreanimal, horario, alimentos, frecuenciaalimentacion, cantidadAlimento);
        }

        // Mostramos los datos recopilados
        for (int i = 0; i < RegistroAlimentacion; i++) {
            JOptionPane.showMessageDialog(null,
                    "Animal: " + arrAlimentacion[i].getNombreanimal()
                    + "\nHora de alimentación: " + arrAlimentacion[i].getHorario()
                    + "\nEste animal consume: " + arrAlimentacion[i].getAlimentos()
                    + "\nEste animal come cada: " + arrAlimentacion[i].getFrecuenciaalimentacion()
                    + "\nEste animal come (kilos): " + arrAlimentacion[i].getCantidadalimento());
        }

    }
}

