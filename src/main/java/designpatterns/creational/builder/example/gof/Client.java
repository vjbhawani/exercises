package designpatterns.creational.builder.example.gof;

public class Client {
    public static void main(String[] args) {
        MazeGame director = new MazeGame();

        StandardBuilder standardBuilder = new StandardBuilder();
        director.buildMaze(standardBuilder);
        Maze standardMaze = standardBuilder.result();

        director.buildComplexMaze(standardBuilder);
        Maze complexMaze = standardBuilder.result();

        CountingMazeBuilder countingMazeBuilder = new CountingMazeBuilder();
        director.buildMaze(countingMazeBuilder);
        Maze standardCountingMaze = standardBuilder.result();

        director.buildComplexMaze(standardBuilder);
        Maze complexCountingMaze = standardBuilder.result();


    }
}
