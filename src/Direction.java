public enum Direction {
    NORTH("północ"), EAST("wschód"), SOUTH("południe"), WEST("zachód");

    private String description;

    private Direction(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public String showDirInfo(){
        return "Ok, więc idziemy na " + getDescription();
    }
}
