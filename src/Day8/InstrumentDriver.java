package Day8;
import java.util.Random;
import java.util.Scanner;
import javax.sound.midi.*;
/**
 * Create an abstract class Instrument which has the abstract function play. Create three more
 * subclasses from Instrument which are Piano, Flute, Guitar. Override the play method inside
 * all three classes printing a message. "Piano is playing tan tan tan tan"
 * for Piano class "Flute is playing toot toot toot toot" for Flute class "Guitar is playing
 * tin tin tin" for Guitar class
 * You must not allow the user to declare an object of Instrument class. Create an array
 * of 10 Instruments. Assign different types of instrument to Instrument reference.
 * Check for the polymorphic behavior of the play method. Use the instanceof operator to
 * print which object stored at which index of instrument array.
 * @Author Anuj Sundriyal
 */
class Sound
{
    static void Band()throws Exception
    {
        Sequencer player = MidiSystem.getSequencer();
        player.open();

        // Making 1a new Sequence
        Sequence seq = new Sequence(Sequence.PPQ, 4);

        // Creating a new track
        Track track = seq.createTrack();

        // Making a Message
        ShortMessage a = new ShortMessage();

        // Put the Instruction in the Message
        a.setMessage(144, 1, 44, 100);

        // Make a new MidiEvent
        MidiEvent noteOn = new MidiEvent(a, 1);

        // Add MidiEvent to the Track
        track.add(noteOn);

        ShortMessage b = new ShortMessage();
        b.setMessage(128, 1, 44, 100);
        MidiEvent noteOff = new MidiEvent(b, 16);
        track.add(noteOff);

        // Giving sequence to Sequencer
        player.setSequence(seq);

        // Start the Sequencer using start() method
        player.start();
    }
}
abstract class Instrument
{
  abstract void play();
}
class Piano extends Instrument
{
    public void play()
    {try {
        System.out.println("tan tan tan tan");
        Sound.Band();
    }catch(Exception e){}
    }
}
class Flute extends Instrument
{
    public void play()
    {
        try {
            System.out.println("Toot toot toot toot");
            Sound.Band();
        }
        catch(Exception e){}
    }
    }

class Guitar extends  Instrument
{
    public void play()
    {
        try {
            System.out.println("Tin tin tin tin");
            Sound.Band();
        }catch(Exception e)
        {

        }
    }
}
public class InstrumentDriver {
    static void MainWork()
    {
        Instrument instrument[]=new Instrument[10];
         Random r = new Random();
         for(int i=0;i<10;i++)
         {
             switch(r.nextInt(3))
             {
                 case 0:
                     instrument[i]=new Piano();
                     break;
                 case 1:
                     instrument[i]=new Flute();
                     break;
                 case 2:
                     instrument[i]=new Guitar();
             }
         }

        for(int i=0;i< instrument.length;i++){
            if(instrument[i] instanceof Piano ){
                System.out.println(i);
                instrument[i].play();
            }
            else if(instrument[i] instanceof  Flute)
            {
                System.out.println(i);
                instrument[i].play();
            }
            else if(instrument[i] instanceof  Guitar)
            {
                System.out.println(i);
                instrument[i].play();
            }


        }
    }
    public static void main(String[] args)throws Exception {
        InstrumentDriver.MainWork();
        }
    }
/*
OUTPUT
0
Tin tin tin tin
1
tan tan tan tan
2
Tin tin tin tin
3
Toot toot toot toot
4
Toot toot toot toot
5
tan tan tan tan
6
tan tan tan tan
7
Toot toot toot toot
8
Toot toot toot toot
9
Tin tin tin tin

 */
