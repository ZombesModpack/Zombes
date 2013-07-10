
 I) Installation

     0) To install this modpack, you must first locate your local Minecraft 
        folder. It depends on your OS:
          - Windows XP/7: %APPDATA%\.minecraft
          - GNU/Linux:    ~/.minecraft
          - Mac/OSX:      ~/Library/Application Support/minecraft

    You can skip this part entirely if you are using a mod-installation tool
    like MCPatcher, MagicLauncher or else, and if it worked of course.

    Then, starting from this folder, you will have to do the following:

     1) Create a subfolder named mods/zombe

     2) Locate versions/1.6.1/1.6.1.jar, we will now call it "the jar"
         a) Make a backup copy of the jar, just in case
         b) Open the jar as a Zip file with a tool like 7-zip
         c) In the jar, delete the subfolder 'META-INF'

     3) Go in the 'Classes' subfolder of this modpack's archive
          - Copy every .class file from it into the jar
            Not all class files are required for the modpack to work.
            The list of mods and features associated with each class file can 
            be found in 'zombe class files <version>.txt' in the mod's archive

     4) Go in the 'config' subfolder of this modpack's archive
          - Copy every .txt file from it into mods/zombe
            so that you have mods/zombe/config.txt
                                 "     /names.txt
                                       ...etc


 II) Configuration

    Starting from your local Minecraft folder (see I):

     1) (optional) Open mods/zombe/config.txt with your favorite text editor
         a) Enable the wanted mods by finding their corresponding line, like:
                #modCloudEnabled       = yes
            and uncommenting them, like:
                modCloudEnabled       = yes
         b) (optional) Configure the enabled mods by setting the values you 
            want to the variables that immediately follow

     2) Launch the game and enjoy
          - (optional) While ingame (in a world),
            press F7 to access to the Zombe ingame config menu


 III) Compatibility

     1) This mod may or may not be compatible with modloader or Forge, 
        depending on many factors (mods versions, installation order...)
        Usually, it is compatible with modloader if installed before modloader

     2) It is usually compatible with:
          - Optifine
          - Rei's minimap
          - Inventory Tweaks

     3) The golden rule is to install Zombe's modpack BEFORE EVERYTHING ELSE,
        including Modloader, Forge, and everything else.
    
    Some class files are conflicting with some of the files of Modloader and
    Forge. These files are essential for these mods but not for Zombe, that's
    the reason behind the previous assertions and more specificaly the third.


 IV) Troubleshooting

    Original throubleshooting page (may be out of date):
        http://dl.dropbox.com/u/19090066/minecraft/readme.html#trouble
    
    note: This webpage can be from slightly-out-of-date to outright-obsolete. 
          If you need up-to-date information you can not find by yourself 
          or want to report a bug you just found in the modpack, you can go 
          on the official Zombe modpack forum thread at this location:
              www.minecraftforum.net/topic/91055-/


 V) Credits

    All credits go first to Zombe (aka tanzanite) for the modpack's existence
    and updating work up to v. 6.2 / MC 1.2.5.
    Then, credits can go to the contributors:
        md_5 for 1.3.1
        NolanSyKinsley for 1.3.2 and 1.4.2
        Nilat for 1.4.4, 1.4.5 and 1.4.6


