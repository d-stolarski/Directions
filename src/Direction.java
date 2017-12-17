public enum Direction {
    NORTH("północ"), EAST("wschód"), SOUTH("południe"), WEST("zachód"), UNDEFINED("nieznany");

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

    public static Direction convert(int num){
        switch(num){
            case 0:
                return NORTH;
            case 1:
                return EAST;
            case 2:
                return SOUTH;
            case 3:
                return WEST;
            default:
                return UNDEFINED;
        }
    }
}
