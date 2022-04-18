public class Tile {
    Character chr;
    Integer points;

    Tile(Character chr, Integer points){
        this.chr = chr;
        this.points = points;
    }

    public Character getChr() {
        return chr;
    }

    public Integer getPoints() {
        return points;
    }
}
