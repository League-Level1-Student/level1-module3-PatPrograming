package _06_gridworld;

import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld {
public static void main(String[] args) {
	World world=new World();
	world.show();
	Bug bug=new Bug();
	bug.getLocation();
	bug.setColor(Color.red);
	Bug bug1=new Bug();
	bug.getLocation();
	bug.setColor(Color.blue);
	bug.getDirection();
	Location location=new Location(0, 0);
	Location location1=new Location(5,7);
	world.add(location, bug1);
	world.add(location1, bug);
	bug1.turn();
	bug1.turn();
	Flower flower=new Flower();
}
}
