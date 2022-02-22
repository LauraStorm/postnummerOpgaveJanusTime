public class PostInfo {
    private int postNumber;
    private String city;

    //Constructor
    public PostInfo(int postNumber, String city) {
        this.postNumber = postNumber;
        this.city = city;
    }

    //Getters & Setters
    public int getPostNumber() {
        return postNumber;
    }

    public void setPostNumber(int postNumber) {
        this.postNumber = postNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    //toString

    @Override
    public String toString() {
        return "• Postnumer: " + postNumber +
                " By: " + city ;
    }
}
