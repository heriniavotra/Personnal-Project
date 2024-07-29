

namespace TPcsharp
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("--------Choix-------");
            Console.WriteLine("1-Inserer un nouveau compte.\n2-Quitter\n3-Crediter");

            while (true)
            {
                Console.WriteLine("\nEntrez votre choix: ");
                if (int.TryParse(Console.ReadLine(), out int choix))
                {
                    if (choix == 1)
                    {
                        

                        Console.WriteLine("----Inserer un nouveau compte----: ");
                        Console.WriteLine("Entrer votre nom: ");
                        string? name = Console.ReadLine();
                        Console.WriteLine("Entrer votre prénom: ");
                        string? firstname = Console.ReadLine();
                        Console.WriteLine("Entrer votre CIN: ");
                        string? cin = Console.ReadLine();
                        Console.WriteLine("Entrer votre numero de téléphone: ");
                        string? phone = Console.ReadLine();

                        Client client = new Client(cin, name, firstname, phone);

                        Compte compte = new Compte(client);
                        compte.Retour();

                        compte.GetProprietaire(); 

                       

                    }
                    else if (choix == 2)
                    {
                        Console.WriteLine("--Insertion terminée--");
                        break;
                    }else
                    {
                        Console.WriteLine("Choix invalide");
                    }
                }
                else
                {
                    Console.WriteLine("Choix invalide. Entrez un nombre valide.");
                }
            }
        }
    }

    class Client
    {
        public string CIN { get; set; }
        public string Nom { get; set; }
        public string Prenom { get; set; }
        public string Tel { get; set; }

        public Client(string cin, string nom, string prenom, string tel)
        {
            CIN = cin;
            Nom = nom;
            Prenom = prenom;
            Tel = tel;
        }

        public void Afficher()
        {
            Console.WriteLine("\n---Description du compte----");
            Console.WriteLine($"\nNom: {Nom} \nPrenom: {Prenom} \nCIN: {CIN} \nTel: {Tel}");
        }
    }

    class Compte
    {
        public int Code { get; }
        public int Solde { get; }

        private Client Proprietaire; 
        private static int compteur = 0;

        public Compte(Client proprietaire)
        {
            Code = ++compteur;
            Proprietaire = proprietaire;
        }

        public void Retour()
        {
            Console.WriteLine("Compte " + Code);
        }
        public void  GetProprietaire()
        {
            Console.WriteLine("****************************************");
            Console.WriteLine($"\nLe proprietaire du compte: \nNumero du compte: {Code}\nNom:{Proprietaire.Nom} \nPrenom:{Proprietaire.Prenom} \nCIN:{Proprietaire.CIN} \nTelephone:{ Proprietaire.Tel}");
          
        }
        public void Crediter(int montant){
            
        }
    }
}
