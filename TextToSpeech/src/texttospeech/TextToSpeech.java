/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package texttospeech;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import java.util.Scanner;

/**
 *
 * @author KIIT
 */
public class TextToSpeech {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
        Voice voice=VoiceManager.getInstance().getVoice("kevin16");
        //System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_time_awb.AlanVoiceDirectory");
        //Voice voice=VoiceManager.getInstance().getVoice("alan");
        Voice[]voicelist=VoiceManager.getInstance().getVoices();
      for(int i=0;i<voicelist.length;i++){
         System.out.println("Voice:"+voicelist[i].getName());
}    
      if(voice!=null){
         voice.allocate();
         voice.setRate(200); 
         voice.setPitch(80); 
         voice.setVolume(1); 
         System.out.println("Voice Rate:"+voice.getRate());
         System.out.println("Voice Pitch:"+voice.getPitch());
         System.out.println("Voice Volume:"+voice.getVolume());
         System.out.println("Enter text to convert to speech:");
         Scanner sc=new Scanner(System.in);
         String input = sc.nextLine();
         boolean status=voice.speak(input);
         System.out.println("Status: "+status);
         voice.deallocate();
         
      }
      else{
          System.out.println("Error in voice");
      }
    }  
}
