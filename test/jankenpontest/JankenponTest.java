package jankenpontest;

import jankenpon.JanKenPon;
import jankenpon.Player;
import jankenpon.Weapon;
import junit.framework.Assert;
import org.junit.Test;

public class JankenponTest {

    @Test
    public void testRockWinsScissors() {
        JanKenPon game = new JanKenPon(new Player("A"), new Player("B"));
        game.getPlayerA().setChoose(Weapon.ROCK);
        game.getPlayerB().setChoose(Weapon.SCISSORS);
        Assert.assertEquals("player A wins", game.play().getDescription());
        Assert.assertEquals(1, game.play().getResult());
    }

    @Test
    public void testScissorsLosesRock() {
        JanKenPon game = new JanKenPon(new Player("A"), new Player("B"));
        game.getPlayerA().setChoose(Weapon.SCISSORS);
        game.getPlayerB().setChoose(Weapon.ROCK);
        Assert.assertEquals("player A loses", game.play().getDescription());
        Assert.assertEquals(-1, game.play().getResult());
    }

    @Test
    public void testScissorsWinsPaper() {
        JanKenPon game = new JanKenPon(new Player("A"), new Player("B"));
        game.getPlayerA().setChoose(Weapon.SCISSORS);
        game.getPlayerB().setChoose(Weapon.PAPER);
        Assert.assertEquals("player A wins", game.play().getDescription());
        Assert.assertEquals(1, game.play().getResult());
    }

    @Test
    public void testScissorsLosesPaper() {
        JanKenPon game = new JanKenPon(new Player("A"), new Player("B"));
        game.getPlayerA().setChoose(Weapon.PAPER);
        game.getPlayerB().setChoose(Weapon.SCISSORS);
        Assert.assertEquals("player A loses", game.play().getDescription());
        Assert.assertEquals(-1, game.play().getResult());
    }

    @Test
    public void testPaperWinsRock() {
        JanKenPon game = new JanKenPon(new Player("A"), new Player("B"));
        game.getPlayerA().setChoose(Weapon.PAPER);
        game.getPlayerB().setChoose(Weapon.ROCK);
        Assert.assertEquals("player A wins", game.play().getDescription());
        Assert.assertEquals(1, game.play().getResult());
    }

    @Test
    public void testPaperLosesRock() {
        JanKenPon game = new JanKenPon(new Player("A"), new Player("B"));
        game.getPlayerA().setChoose(Weapon.ROCK);
        game.getPlayerB().setChoose(Weapon.PAPER);
        Assert.assertEquals("player A loses", game.play().getDescription());
        Assert.assertEquals(-1, game.play().getResult());
    }

    @Test
    public void testRockDeadHead() {
        JanKenPon game = new JanKenPon(new Player("A"), new Player("B"));
        game.getPlayerA().setChoose(Weapon.ROCK);
        game.getPlayerB().setChoose(Weapon.ROCK);
        Assert.assertEquals("dead head", game.play().getDescription());
        Assert.assertEquals(0, game.play().getResult());
    }

    @Test
    public void testScissorsDeadHead() {
        JanKenPon game = new JanKenPon(new Player("A"), new Player("B"));
        game.getPlayerA().setChoose(Weapon.SCISSORS);
        game.getPlayerB().setChoose(Weapon.SCISSORS);
        Assert.assertEquals("dead head", game.play().getDescription());
        Assert.assertEquals(0, game.play().getResult());
    }

    @Test
    public void testPaperDeadHead() {
        JanKenPon game = new JanKenPon(new Player("A"), new Player("B"));
        game.getPlayerA().setChoose(Weapon.PAPER);
        game.getPlayerB().setChoose(Weapon.PAPER);
        Assert.assertEquals("dead head", game.play().getDescription());
        Assert.assertEquals(0, game.play().getResult());
    }
}