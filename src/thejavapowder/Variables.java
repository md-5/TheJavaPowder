package thejavapowder;

import thejavapowder.Elements.*;

import java.awt.*;

public class Variables {

	Graphics bufferGraphics;

    boolean Drawing       = false;
    boolean antiDouble    = false;
    boolean active        = true; //For elements menu
    boolean stopReactions = false;
    boolean Simulating    = true;//Paused or not paused
	boolean tempSimulating= false;//Paused or not paused
    boolean leftClick     = true;
    boolean conductive    = false;




    /*Transformated Variables:
     * Variables that represents a long calculation used often
     */
    int MouseX      = 100;
    int MouseY      = 100;
    int realZoom    = 2;//Zoom * winZoom
    int DrawX       = 0;//Where to draw
    int DrawY       = 0;
    int LastDrawX   = 0;//Where to draw
    int LastDrawY   = 0;
	int PaintFPS    = 0;
    //End of Transformated Variables

    /* The state it is it
     * 0 = Normal
     * 1 = Menu
     * 2 = Element Menu
     * 3 = Settings
     * 4 = Documentation
     * 5 = Console
     */
    int state           = 0;
    int RandomNum       = 0;
    int optionsHeight   = 30;

    int wait            = 30;
    int CurrentX        = 100;
    int CurrentY        = 100;
    int ScrollX         = 0;
    int ScrollY         = 0;
    int iconY           = 0;
    int iconX           = 0;
    byte Zoom           = 1;
    byte Size           = 10;
    byte Shape          = 0;
    byte Equipped       = 3;
    byte overEl         = -1;

    float Brightness    = 0.0f;

    int[]     surArray    = new int   [8];
    byte[]    reaction    = new byte  [16];
    byte[]    reactives   = new byte  []{};



    //Elements Initialization
    //Order of creation:
    // new Element(  burn,      weight, conductive, Name,                       Description,                                colour,   reactives,     temp, life)
    final Element Elements[] = {
        new Powder( (byte) 0,  (byte) 20,  false, "Coffee",             "First Element, Reference to Java",                 0x613F37, new byte[]{3},  20, (byte)1),
        new Solid(  (byte) 0,  (byte) 127, false, "Wall",               "Blocks Everything",                                0x808080, new byte[]{},   20, (byte)1),
        new Gas(    (byte) 10, (byte) 5,   false, "Methane",            "Highly Flammable Gas",                             0xDEDEDE, new byte[]{15}, 20, (byte)1),
        new Liquid( (byte) 0,  (byte) 60,  true,  "Water",              "Pure H2O",                                         0x0000FF, new byte[]{15}, 20, (byte)1),
        new Solid(  (byte) 0,  (byte) 127, true,  "Iron",               "Conductor, Used to Activate Electrical Elements",  0x404040, new byte[]{},   20, (byte)1),
        new Solid(  (byte) 4,  (byte) 127, true,  "Battery",            "Infinite Source of Energy",                        0x00FF00, new byte[]{},   20, (byte)1),
        new Solid(  (byte) 0,  (byte) 127, false, "Copper",             "Standard Conductor",                               0xE8851C, new byte[]{},   20, (byte)1),
        new Solid(  (byte) 0,  (byte) 127, true,  "SemiConductorA",     "Conducts only to Semi Conductor B",                0x226315, new byte[]{},   20, (byte)1),
        new Solid(  (byte) 0,  (byte) 127, true,  "SemiConductorB",     "Conducts only to Metal",                           0x829E1C, new byte[]{},   20, (byte)1),
        new Solid(  (byte) 0,  (byte) 127, true,  "Screen",             "Looks different Based on Voltage",                 0x000000, new byte[]{},   20, (byte)1),
        new Solid(  (byte) 0,  (byte) 127, true,  "Resistor",           "Lowers the voltage",                               0xEDED9D, new byte[]{},   20, (byte)1),
        new Solid(  (byte) 0,  (byte) 127, true,  "Rechargable Battery","Limited source of Power",                          0x329E00, new byte[]{},   20, (byte)1),
        new Solid(  (byte) 4,  (byte) 127, true,  "Power Drainer",      "Drains the electricity",                           0xBABABA, new byte[]{},   20, (byte)1),
        new Solid(  (byte) 0,  (byte) 127, false, "Crossing",           "Makes electricity jump over it",      				0xE8851C, new byte[]{},   20, (byte)1),
        new Solid(  (byte) 0,  (byte) 127, false, "Switch",             "Conducts if turned on",              				0x00ED00, new byte[]{},   20, (byte)1),
        new Gas(    (byte) 0,  (byte) 5,   false, "Fire",               "Burns stuff",                                      0xDE2307, new byte[]{},   500,(byte)255),
        new Solid(  (byte) 2,  (byte) 127, false, "Wood",               "Burns slowly",                                     0xC0A040, new byte[]{},   20, (byte)1),
        new Liquid( (byte) 30, (byte) 50,  false, "Petroleum",          "Oil, burns",                                       0x404010, new byte[]{},   20, (byte)1),
        new Powder( (byte) 16, (byte) 15,  false, "Sawdust",            "Sawdust",                                          0xFFE0A0, new byte[]{},   20, (byte)1),
        new Powder( (byte) 0, (byte) 70,   true,  "Metal powder",       "A metalic powder, Conductive.",                    0x919191, new byte[]{},   20, (byte)1),
        new Gas(    (byte) 16, (byte) 5,   false, "Oxygen",             "Oxygen",                                           0x00D9D9, new byte[]{},   20, (byte)1),
        new Liquid( (byte) 0,  (byte) 150, true,  "Mercury",            "Mercury, heavy conductive powder",                 0x6B6B6B, new byte[]{},   20, (byte)1),
        new Powder( (byte) 25, (byte) 15,  false, "Gunpowder",          "Gunpowder, it burns",                              0xC7C697, new byte[]{},   20, (byte)1),

        };
	// new Element(  burn,      weight, conductive, Name,                       Description,                                  colour, reactives, default temp)

     public final int NUM_ELS = 23;
}
