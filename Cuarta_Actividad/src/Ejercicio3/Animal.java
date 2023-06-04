package Ejericicio3;

public abstract class Animal {
    protected String sound;
    protected String habitat;
    protected String scientificName;
    protected String diet;

    //Metodos abstractos que definiremos en clases hijas

    public abstract String getSound();
    public abstract String getHabitat();
    public abstract String getScientificName();
    public abstract String getDiet();
}
