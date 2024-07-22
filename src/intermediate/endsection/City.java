package intermediate.endsection;

public class City {
    private Building[] buildings = new Building[3];
    public City(){
        Item[] bankItems = new Item[2];
        bankItems[0] = new Item("Letter opener", 1.5);
        bankItems[1] = new Item("Stamp", 2.5);
        buildings[0] = new Building("Bank", bankItems);

        Item[] mansionItems = new Item[2];
        mansionItems[0] = new Item("Pair of fancy shoes", 25.0);
        mansionItems[1] = new Item("Broken glass", 2.5);
        buildings[1] = new Building("Mansion", mansionItems);

        Item[] postOfficeItems = new Item[2];
        postOfficeItems[0] = new Item("Letter to Jenny", 1.5);
        postOfficeItems[1] = new Item("Pencil", 2.5);
        buildings[2] = new Building("Post Office", postOfficeItems);
    }

    public Building[] getBuildings() {
        return buildings;
    }
}
