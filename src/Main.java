import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void Main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a sample DistributeurAuto instance
        DistributeurAuto distributeur = new DistributeurAuto();

        // Create a map to store client instances by ID
        Map<String, Client> clients = new HashMap<>();

        // Sample clients
        Client client1 = new Client("12345678", 100.0f);
        Client client2 = new Client("9876543", 50.0f);

        clients.put(client1.getId(), client1);
        clients.put(client2.getId(), client2);

        // User interface
        System.out.println("Bienvenue dans le distributeur automatique!");

        while (true) {
            System.out.println("\nEntrez le client ID (ou 'exit' pour quitter):");
            String clientId = scanner.nextLine();

            if (clientId.equals("exit")) {
                System.out.println("Au revoir!");
                break;
            }

            Client client = clients.get(clientId);

            if (client == null) {
                System.out.println("Client non trouvé. Veuillez réessayer.");
                continue;
            }

            System.out.println("\nBienvenue, " + client.getId() + "!");

            while (true) {
                System.out.println("\nChoisissez une option:");
                System.out.println("1. Ajouter de l'argent");
                System.out.println("2. Retirer de l'argent");
                System.out.println("3. Afficher le solde");
                System.out.println("4. Imprimer un ticket");
                System.out.println("0. Changer de client");

                int choice = scanner.nextInt();
                scanner.nextLine(); 

                switch (choice) {
                    case 1:
                        System.out.println("Entrez le montant à ajouter :");
                        float ajout = scanner.nextFloat();
                        client.insereargent(ajout, distributeur);
                        System.out.println("Montant ajouté avec succès!");
                        break;

                    case 2:
                        System.out.println("Entrez le montant à retirer :");
                        float retrait = scanner.nextFloat();
                        client.retireargent(retrait, distributeur);
                        System.out.println("Montant retiré avec succès!");
                        break;

                    case 3:
                        client.affichersolde();
                        break;

                    case 4:
                        client.impressionticket();
                        break;

                    case 0:
                        System.out.println("Changement de client.");
                        break;

                    default:
                        System.out.println("Option invalide. Veuillez choisir à nouveau.");
                        break;
                }

                if (choice == 0) {
                    break;
                }
            }
        }
    }
}