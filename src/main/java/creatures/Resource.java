package creatures;

public enum Resource {
	COPPER("copper",5),
	STEEL("steel",3),
	DIAMOND("diamond",20);

    final String name;
    final int value;
    
    Resource(String name,int value) {
        this.name = name;
        this.value = value;
    }
}
