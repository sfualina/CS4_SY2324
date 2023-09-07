class Main {
  public static void main(String[] args) {
    
    String band1 = "my bloody valentine";
        String genre1 = "Shoegaze";
        int age1 = 40;
        System.out.println("Band 1 \nName: " + band1 + "\nGenre: " + genre1 + 
        "\nAge: " + age1 + " years\n");

    String band2 = "Car Seat Headrest";
        String genre2 = "Rock";
        int age2 = 13;
        System.out.println("Band 2 \nName: " + band2 + "\nGenre: " + genre2 + 
        "\nAge: " + age2 + " years\n");

    String band3 = "Alvvays";
        String genre3 = "Indie Pop";
        int age3 = 12;
        System.out.println("Band 3 \nName: " + band3 + "\nGenre: " + genre3 + 
        "\nAge: " + age3 + " years\n");

        int ageTotal = age1 + age2 + age3;
        boolean sameGenre = (genre1 == genre2) && (genre1 == genre3) && (genre2 == 
        genre3);
        boolean band1IsOldest = (age1 > age2) && (age1 > age3);

    
        System.out.println("Total age: " + ageTotal + " years");
        System.out.println("my bloody valentine is the oldest band: " + band1IsOldest);
        System.out.println("All artists play the same genre: " + sameGenre);

  }
}