public enum Genre {

    FICTION("Made up stuff"),
    NONFICTION("Real stuff that might also contain made up stuff"),
    WAR("Fightt, fighty, bang-bang");

    // Constructor
    // Describes how each enum symbol can have a description
    private String description;

    // METHOD - assign a description to each genre type
    // SETTER method to assign a decription to each of the enum Genre's symbols
    Genre(String description) {
        this.description = description;
    }

    // METHOD - retrieve the description assigned to a genre symbol type
    // GETTER method to retrieve a description associated with a enum Genre
    // RETURNS a string
    public String getDescription() {
        return this.description;
    }

}
