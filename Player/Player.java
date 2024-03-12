package Player;


import Character.Archer.Archer;
import Character.Healer.Healer;
import Character.Knight.Knight;
import Character.Mage.Mage;
import Character.MythicalCreature.MythicalCreature;
import Views.Block;
import Views.Board;

public class Player {
    private String name;
    private String userName;
    private short xp;
    private int coins;
    private String homeGround;

    //Army
    public Archer archer;
    public Healer healer;
    public Knight knight;
    public Mage mage;
    public MythicalCreature mythicalCreature;
    
    public Player(String name, String userName, String homeGround){
        this.name = name;
        this.userName = userName;
        this.coins = 500;
        this.homeGround = homeGround;
        xp = 0;
    }

    public void setArcher(String name){
        archer = new Archer(name);
        
    }

    public void setHealer(String name){
        healer = new Healer(name);
    }

    public void setKnight(String name){
        knight = new Knight(name);
    }

    public void setMage(String name){
        mage = new Mage(name);
    }

    public void setMythicalCreature(String name){
        mythicalCreature = new MythicalCreature(name);
    }

    
    public void setXp(short xp){
        this.xp = xp;
    }
    public short getXp(){
        return xp;
    }
    public void setCoins(int coins){
        this.coins = coins;
    }
    public int getCoins(){
        return coins;
    }
    public void setHomeGround(String homeGround){
        this.homeGround = homeGround;
    }
    public String getHomeGround(){
        return homeGround;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }  
    public void displayCharacters(){
        // Creating the table
        Board board = new Board(120);

        // Title
        Block title = new Block(board, 105, 1, "Characters");
        title.setDataAlign(Block.DATA_CENTER);
        title.allowGrid(false);
        board.setInitialBlock(title);

        //Archer
        Block archerTitle = new Block(board, 20, 1,"ARCHER");
        title.setBelowBlock(archerTitle.setDataAlign(Block.DATA_CENTER));
        Block archerInfo = new Block(board, 20, 6, "NAME: " + archer.getName() + "\n" + "ATTACK: " + archer.getAttack() + "\n" + "DEFENSE: " + archer.getDefense() + "\n" + "HEALTH: " + archer.getHealth() + "\n" + "SPEED: " + archer.getSpeed());
        archerTitle.setBelowBlock(archerInfo);

        //Healer
        Block healerTitle = new Block(board, 20, 1,"HEALER");
        archerTitle.setRightBlock(healerTitle.setDataAlign(Block.DATA_CENTER));
        Block healerInfo = new Block(board, 20, 6, "NAME: " + healer.getName() + "\n" + "ATTACK: " + healer.getAttack() + "\n" + "DEFENSE: " + healer.getDefense() + "\n" + "HEALTH: " + healer.getHealth() + "\n" + "SPEED: " + healer.getSpeed());
        healerTitle.setBelowBlock(healerInfo);

        //Knight
        Block knightTitle = new Block(board, 20, 1,"KNIGHT");
        healerTitle.setRightBlock(knightTitle.setDataAlign(Block.DATA_CENTER));
        Block knightInfo = new Block(board, 20, 6, "NAME: " + knight.getName() + "\n" + "ATTACK: " + knight.getAttack() + "\n" + "DEFENSE: " + knight.getDefense() + "\n" + "HEALTH: " + knight.getHealth() + "\n" + "SPEED: " + knight.getSpeed());
        knightTitle.setBelowBlock(knightInfo);

        //Mage
        Block mageTitle = new Block(board, 20, 1,"MAGE");
        knightTitle.setRightBlock(mageTitle.setDataAlign(Block.DATA_CENTER));
        Block mageInfo = new Block(board, 20, 6, "NAME: " + mage.getName() + "\n" + "ATTACK: " + mage.getAttack() + "\n" + "DEFENSE: " + mage.getDefense() + "\n" + "HEALTH: " + mage.getHealth() + "\n" + "SPEED: " + mage.getSpeed());
        mageTitle.setBelowBlock(mageInfo);

        //Mythical Creature
        Block mythicalCreatureTitle = new Block(board, 20, 1,"MYTHICAL CREATURE");
        mageTitle.setRightBlock(mythicalCreatureTitle.setDataAlign(Block.DATA_CENTER));
        Block mythicalCreatureInfo = new Block(board, 20, 6, "NAME: " + mythicalCreature.getName() + "\n" + "ATTACK: " + mythicalCreature.getAttack() + "\n" + "DEFENSE: " + mythicalCreature.getDefense() + "\n" + "HEALTH: " + mythicalCreature.getHealth() + "\n" + "SPEED: " + mythicalCreature.getSpeed());
        mythicalCreatureTitle.setBelowBlock(mythicalCreatureInfo);

        System.out.println(board.invalidate().build().getPreview());        
    }
    
    
}