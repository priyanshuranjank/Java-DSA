public class Gallery { 
    public static void main(String[] args) {
        ImageProperties ip = new ImageProperties();

        ip.setName("Batman.jpg");
        ip.setSize(1024);
        ip.setDim("1920 x 2400");

        System.out.println(ip.name);
        System.out.println(ip.size+"MB");
        System.out.println(ip.dimension+"pixels");
    }
} 

class ImageProperties{
    String name;
    int size;
    String dimension;
    
    void setName(String title){
        name = title;
    }
    void setSize(int num){
        size = num;
    }
    void setDim(String dim){
        dimension = dim;
    }
}