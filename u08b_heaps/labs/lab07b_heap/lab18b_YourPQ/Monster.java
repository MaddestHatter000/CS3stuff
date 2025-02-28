public class Monster implements Comparable
{
    private int weight, height, age;

    public Monster(){
        this(0, 0, 0);
    }
    public Monster(int wt, int ht, int a){
        setAge(a);
        setHeight(ht);
        setWeight(ht);
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }
    public int getHeight() {
        return height;
    }
    public int getWeight() {
        return weight;
    }


    public int compareTo(Object o)
    {
        if(((Monster)o).getAge() == age){
            if(((Monster)o).getHeight() == height){
                if(((Monster)o).getWeight() == weight){
                    return 0;
                }
                return ((Monster)o).getWeight() - weight;
            }
            return ((Monster)o).getHeight() - height;
        }
        return ((Monster)o).getAge() - age;
    }
    
    public String toString() {
        return height + " " + weight + " " + age;
    }
}
