import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class PlantFiller extends ClockDomain{
  public PlantFiller(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal valveInjectorOnOff = new Signal("valveInjectorOnOff", Signal.INPUT);
  public Signal valveInletOnOff = new Signal("valveInletOnOff", Signal.INPUT);
  public Signal dosUnitValveRetract = new Signal("dosUnitValveRetract", Signal.INPUT);
  public Signal dosUnitValveExtend = new Signal("dosUnitValveExtend", Signal.INPUT);
  public Signal jobDone = new Signal("jobDone", Signal.INPUT);
  public Signal enable = new Signal("enable", Signal.INPUT);
  public Signal enableFiller = new Signal("enableFiller", Signal.INPUT);
  public Signal bottleAtPos2 = new Signal("bottleAtPos2", Signal.OUTPUT);
  public Signal dosUnitEvac = new Signal("dosUnitEvac", Signal.OUTPUT);
  public Signal dosUnitFilled = new Signal("dosUnitFilled", Signal.OUTPUT);
  public Signal injectorOn = new Signal("injectorOn", Signal.OUTPUT);
  public Signal injectorOff = new Signal("injectorOff", Signal.OUTPUT);
  public Signal inletOn = new Signal("inletOn", Signal.OUTPUT);
  public Signal inletOff = new Signal("inletOff", Signal.OUTPUT);
  public Signal jobDoneN = new Signal("jobDoneN", Signal.OUTPUT);
  public Signal bottleAtPos2E = new Signal("bottleAtPos2E", Signal.OUTPUT);
  public Signal dosUnitEvacE = new Signal("dosUnitEvacE", Signal.OUTPUT);
  public Signal dosUnitFilledE = new Signal("dosUnitFilledE", Signal.OUTPUT);
  public Signal injectorOnE = new Signal("injectorOnE", Signal.OUTPUT);
  public Signal injectorOffE = new Signal("injectorOffE", Signal.OUTPUT);
  public Signal inletOnE = new Signal("inletOnE", Signal.OUTPUT);
  public Signal inletOffE = new Signal("inletOffE", Signal.OUTPUT);
  public Signal jobDoneE = new Signal("jobDoneE", Signal.OUTPUT);
  private int S15333 = 1;
  private int S14645 = 1;
  private int S14594 = 1;
  private int S14710 = 1;
  private int S14663 = 1;
  private int S14775 = 1;
  private int S14712 = 1;
  private int S14834 = 1;
  private int S14783 = 1;
  private int S14893 = 1;
  private int S14842 = 1;
  private int S14959 = 1;
  private int S14901 = 1;
  private int S14895 = 1;
  private int S14909 = 1;
  private int S14917 = 1;
  private int S14925 = 1;
  private int S14933 = 1;
  private int S14941 = 1;
  private int S14949 = 1;
  private int S14957 = 1;
  
  private int[] ends = new int[16];
  private int[] tdone = new int[16];
  
  public void thread15364(int [] tdone, int [] ends){
        switch(S14957){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(jobDoneN.getprestatus()){//sysj\plantFiller.sysj line: 94, column: 24
          jobDoneE.setPresent();//sysj\plantFiller.sysj line: 94, column: 34
          currsigs.addElement(jobDoneE);
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        else {
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        break;
      
    }
  }

  public void thread15363(int [] tdone, int [] ends){
        switch(S14949){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(inletOff.getprestatus()){//sysj\plantFiller.sysj line: 92, column: 24
          inletOffE.setPresent();//sysj\plantFiller.sysj line: 92, column: 34
          currsigs.addElement(inletOffE);
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
        else {
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
        break;
      
    }
  }

  public void thread15362(int [] tdone, int [] ends){
        switch(S14941){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(inletOn.getprestatus()){//sysj\plantFiller.sysj line: 90, column: 24
          inletOnE.setPresent();//sysj\plantFiller.sysj line: 90, column: 33
          currsigs.addElement(inletOnE);
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        else {
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        break;
      
    }
  }

  public void thread15361(int [] tdone, int [] ends){
        switch(S14933){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(injectorOff.getprestatus()){//sysj\plantFiller.sysj line: 88, column: 24
          injectorOffE.setPresent();//sysj\plantFiller.sysj line: 88, column: 37
          currsigs.addElement(injectorOffE);
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
        else {
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
        break;
      
    }
  }

  public void thread15360(int [] tdone, int [] ends){
        switch(S14925){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(injectorOn.getprestatus()){//sysj\plantFiller.sysj line: 86, column: 24
          injectorOnE.setPresent();//sysj\plantFiller.sysj line: 86, column: 36
          currsigs.addElement(injectorOnE);
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        else {
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        break;
      
    }
  }

  public void thread15359(int [] tdone, int [] ends){
        switch(S14917){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(dosUnitFilled.getprestatus()){//sysj\plantFiller.sysj line: 84, column: 24
          dosUnitFilledE.setPresent();//sysj\plantFiller.sysj line: 84, column: 39
          currsigs.addElement(dosUnitFilledE);
          active[10]=1;
          ends[10]=1;
          tdone[10]=1;
        }
        else {
          active[10]=1;
          ends[10]=1;
          tdone[10]=1;
        }
        break;
      
    }
  }

  public void thread15358(int [] tdone, int [] ends){
        switch(S14909){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(dosUnitEvac.getprestatus()){//sysj\plantFiller.sysj line: 82, column: 24
          dosUnitEvacE.setPresent();//sysj\plantFiller.sysj line: 82, column: 37
          currsigs.addElement(dosUnitEvacE);
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        else {
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        break;
      
    }
  }

  public void thread15357(int [] tdone, int [] ends){
        switch(S14901){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S14895){
          case 0 : 
            S14895=0;
            if(bottleAtPos2.getprestatus()){//sysj\plantFiller.sysj line: 80, column: 24
              bottleAtPos2E.setPresent();//sysj\plantFiller.sysj line: 80, column: 38
              currsigs.addElement(bottleAtPos2E);
              S14895=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              S14895=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
          case 1 : 
            S14895=1;
            S14895=0;
            if(bottleAtPos2.getprestatus()){//sysj\plantFiller.sysj line: 80, column: 24
              bottleAtPos2E.setPresent();//sysj\plantFiller.sysj line: 80, column: 38
              currsigs.addElement(bottleAtPos2E);
              S14895=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              S14895=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread15356(int [] tdone, int [] ends){
        switch(S14959){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        thread15357(tdone,ends);
        thread15358(tdone,ends);
        thread15359(tdone,ends);
        thread15360(tdone,ends);
        thread15361(tdone,ends);
        thread15362(tdone,ends);
        thread15363(tdone,ends);
        thread15364(tdone,ends);
        int biggest15365 = 0;
        if(ends[8]>=biggest15365){
          biggest15365=ends[8];
        }
        if(ends[9]>=biggest15365){
          biggest15365=ends[9];
        }
        if(ends[10]>=biggest15365){
          biggest15365=ends[10];
        }
        if(ends[11]>=biggest15365){
          biggest15365=ends[11];
        }
        if(ends[12]>=biggest15365){
          biggest15365=ends[12];
        }
        if(ends[13]>=biggest15365){
          biggest15365=ends[13];
        }
        if(ends[14]>=biggest15365){
          biggest15365=ends[14];
        }
        if(ends[15]>=biggest15365){
          biggest15365=ends[15];
        }
        if(biggest15365 == 1){
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
        //FINXME code
        if(biggest15365 == 0){
          S14959=0;
          active[7]=0;
          ends[7]=0;
          tdone[7]=1;
        }
        break;
      
    }
  }

  public void thread15355(int [] tdone, int [] ends){
        switch(S14893){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S14842){
          case 0 : 
            if((dosUnitValveExtend.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 68, column: 20
              S14842=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              dosUnitFilled.setPresent();//sysj\plantFiller.sysj line: 69, column: 5
              currsigs.addElement(dosUnitFilled);
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plantFiller.sysj line: 71, column: 10
              S14842=2;
              if((dosUnitValveRetract.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 72, column: 20
                S14842=3;
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
              else {
                dosUnitEvac.setPresent();//sysj\plantFiller.sysj line: 73, column: 5
                currsigs.addElement(dosUnitEvac);
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
            }
            else {
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
          case 2 : 
            if((dosUnitValveRetract.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 72, column: 20
              S14842=3;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              dosUnitEvac.setPresent();//sysj\plantFiller.sysj line: 73, column: 5
              currsigs.addElement(dosUnitEvac);
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plantFiller.sysj line: 75, column: 10
              S14842=0;
              if((dosUnitValveExtend.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 68, column: 20
                S14842=1;
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
              else {
                dosUnitFilled.setPresent();//sysj\plantFiller.sysj line: 69, column: 5
                currsigs.addElement(dosUnitFilled);
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
            }
            else {
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread15354(int [] tdone, int [] ends){
        switch(S14834){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S14783){
          case 0 : 
            if((valveInletOnOff.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 55, column: 21
              S14783=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              inletOff.setPresent();//sysj\plantFiller.sysj line: 56, column: 5
              currsigs.addElement(inletOff);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plantFiller.sysj line: 58, column: 10
              S14783=2;
              if((!valveInletOnOff.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 59, column: 20
                S14783=3;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                inletOn.setPresent();//sysj\plantFiller.sysj line: 60, column: 5
                currsigs.addElement(inletOn);
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
            }
            else {
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 2 : 
            if((!valveInletOnOff.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 59, column: 20
              S14783=3;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              inletOn.setPresent();//sysj\plantFiller.sysj line: 60, column: 5
              currsigs.addElement(inletOn);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plantFiller.sysj line: 62, column: 10
              S14783=0;
              if((valveInletOnOff.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 55, column: 21
                S14783=1;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                inletOff.setPresent();//sysj\plantFiller.sysj line: 56, column: 5
                currsigs.addElement(inletOff);
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
            }
            else {
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread15353(int [] tdone, int [] ends){
        switch(S14775){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S14712){
          case 0 : 
            if(jobDone.getprestatus()){//sysj\plantFiller.sysj line: 43, column: 10
              System.out.println("jobDone2");//sysj\plantFiller.sysj line: 44, column: 4
              S14712=1;
              if((!jobDone.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 45, column: 21
                S14712=2;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                System.out.println("jobDone3");//sysj\plantFiller.sysj line: 46, column: 5
                jobDoneN.setPresent();//sysj\plantFiller.sysj line: 47, column: 6
                currsigs.addElement(jobDoneN);
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
            }
            else {
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            if((!jobDone.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 45, column: 21
              S14712=2;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              jobDoneN.setPresent();//sysj\plantFiller.sysj line: 47, column: 6
              currsigs.addElement(jobDoneN);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 2 : 
            if(!enable.getprestatus()){//sysj\plantFiller.sysj line: 49, column: 9
              S14712=0;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread15352(int [] tdone, int [] ends){
        switch(S14710){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S14663){
          case 0 : 
            if(enableFiller.getprestatus()){//sysj\plantFiller.sysj line: 32, column: 11
              S14663=1;
              if((!enableFiller.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 33, column: 21
                S14663=2;
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
              else {
                System.out.println("enableFiller");//sysj\plantFiller.sysj line: 34, column: 5
                bottleAtPos2.setPresent();//sysj\plantFiller.sysj line: 35, column: 5
                currsigs.addElement(bottleAtPos2);
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
            }
            else {
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            if((!enableFiller.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 33, column: 21
              S14663=2;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              bottleAtPos2.setPresent();//sysj\plantFiller.sysj line: 35, column: 5
              currsigs.addElement(bottleAtPos2);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 2 : 
            if(!enable.getprestatus()){//sysj\plantFiller.sysj line: 37, column: 9
              S14663=0;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread15351(int [] tdone, int [] ends){
        switch(S14645){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S14594){
          case 0 : 
            if((valveInjectorOnOff.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 19, column: 21
              S14594=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              injectorOff.setPresent();//sysj\plantFiller.sysj line: 20, column: 5
              currsigs.addElement(injectorOff);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plantFiller.sysj line: 22, column: 10
              S14594=2;
              if((!valveInjectorOnOff.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 23, column: 20
                S14594=3;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                injectorOn.setPresent();//sysj\plantFiller.sysj line: 24, column: 5
                currsigs.addElement(injectorOn);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 2 : 
            if((!valveInjectorOnOff.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 23, column: 20
              S14594=3;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              injectorOn.setPresent();//sysj\plantFiller.sysj line: 24, column: 5
              currsigs.addElement(injectorOn);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plantFiller.sysj line: 26, column: 10
              S14594=0;
              if((valveInjectorOnOff.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 19, column: 21
                S14594=1;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                injectorOff.setPresent();//sysj\plantFiller.sysj line: 20, column: 5
                currsigs.addElement(injectorOff);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread15348(int [] tdone, int [] ends){
        S14957=1;
    if(jobDoneN.getprestatus()){//sysj\plantFiller.sysj line: 94, column: 24
      jobDoneE.setPresent();//sysj\plantFiller.sysj line: 94, column: 34
      currsigs.addElement(jobDoneE);
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
    else {
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread15347(int [] tdone, int [] ends){
        S14949=1;
    if(inletOff.getprestatus()){//sysj\plantFiller.sysj line: 92, column: 24
      inletOffE.setPresent();//sysj\plantFiller.sysj line: 92, column: 34
      currsigs.addElement(inletOffE);
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
    else {
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
  }

  public void thread15346(int [] tdone, int [] ends){
        S14941=1;
    if(inletOn.getprestatus()){//sysj\plantFiller.sysj line: 90, column: 24
      inletOnE.setPresent();//sysj\plantFiller.sysj line: 90, column: 33
      currsigs.addElement(inletOnE);
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
    else {
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
  }

  public void thread15345(int [] tdone, int [] ends){
        S14933=1;
    if(injectorOff.getprestatus()){//sysj\plantFiller.sysj line: 88, column: 24
      injectorOffE.setPresent();//sysj\plantFiller.sysj line: 88, column: 37
      currsigs.addElement(injectorOffE);
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
    else {
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
  }

  public void thread15344(int [] tdone, int [] ends){
        S14925=1;
    if(injectorOn.getprestatus()){//sysj\plantFiller.sysj line: 86, column: 24
      injectorOnE.setPresent();//sysj\plantFiller.sysj line: 86, column: 36
      currsigs.addElement(injectorOnE);
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
    else {
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread15343(int [] tdone, int [] ends){
        S14917=1;
    if(dosUnitFilled.getprestatus()){//sysj\plantFiller.sysj line: 84, column: 24
      dosUnitFilledE.setPresent();//sysj\plantFiller.sysj line: 84, column: 39
      currsigs.addElement(dosUnitFilledE);
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    else {
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread15342(int [] tdone, int [] ends){
        S14909=1;
    if(dosUnitEvac.getprestatus()){//sysj\plantFiller.sysj line: 82, column: 24
      dosUnitEvacE.setPresent();//sysj\plantFiller.sysj line: 82, column: 37
      currsigs.addElement(dosUnitEvacE);
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    else {
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread15341(int [] tdone, int [] ends){
        S14901=1;
    S14895=0;
    if(bottleAtPos2.getprestatus()){//sysj\plantFiller.sysj line: 80, column: 24
      bottleAtPos2E.setPresent();//sysj\plantFiller.sysj line: 80, column: 38
      currsigs.addElement(bottleAtPos2E);
      S14895=1;
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    else {
      S14895=1;
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread15340(int [] tdone, int [] ends){
        S14959=1;
    thread15341(tdone,ends);
    thread15342(tdone,ends);
    thread15343(tdone,ends);
    thread15344(tdone,ends);
    thread15345(tdone,ends);
    thread15346(tdone,ends);
    thread15347(tdone,ends);
    thread15348(tdone,ends);
    int biggest15349 = 0;
    if(ends[8]>=biggest15349){
      biggest15349=ends[8];
    }
    if(ends[9]>=biggest15349){
      biggest15349=ends[9];
    }
    if(ends[10]>=biggest15349){
      biggest15349=ends[10];
    }
    if(ends[11]>=biggest15349){
      biggest15349=ends[11];
    }
    if(ends[12]>=biggest15349){
      biggest15349=ends[12];
    }
    if(ends[13]>=biggest15349){
      biggest15349=ends[13];
    }
    if(ends[14]>=biggest15349){
      biggest15349=ends[14];
    }
    if(ends[15]>=biggest15349){
      biggest15349=ends[15];
    }
    if(biggest15349 == 1){
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread15339(int [] tdone, int [] ends){
        S14893=1;
    S14842=0;
    if((dosUnitValveExtend.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 68, column: 20
      S14842=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      dosUnitFilled.setPresent();//sysj\plantFiller.sysj line: 69, column: 5
      currsigs.addElement(dosUnitFilled);
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread15338(int [] tdone, int [] ends){
        S14834=1;
    S14783=0;
    if((valveInletOnOff.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 55, column: 21
      S14783=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      inletOff.setPresent();//sysj\plantFiller.sysj line: 56, column: 5
      currsigs.addElement(inletOff);
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread15337(int [] tdone, int [] ends){
        S14775=1;
    S14712=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread15336(int [] tdone, int [] ends){
        S14710=1;
    S14663=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread15335(int [] tdone, int [] ends){
        S14645=1;
    S14594=0;
    if((valveInjectorOnOff.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 19, column: 21
      S14594=1;
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      injectorOff.setPresent();//sysj\plantFiller.sysj line: 20, column: 5
      currsigs.addElement(injectorOff);
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S15333){
        case 0 : 
          S15333=0;
          break RUN;
        
        case 1 : 
          S15333=2;
          S15333=2;
          class GUI extends Object implements java.lang.Runnable {//sysj\plantFiller.sysj line: 9, column: 1
            public void run() {//sysj\plantFiller.sysj line: 11, column: 21
              org.compsys704.Filler.main(null);//sysj\plantFiller.sysj line: 12, column: 4
            }
            GUI(){//sysj\plantFiller.sysj line: 10, column: 42
            }
          }
          new Thread(new GUI()).start();//sysj\plantFiller.sysj line: 15, column: 2
          thread15335(tdone,ends);
          thread15336(tdone,ends);
          thread15337(tdone,ends);
          thread15338(tdone,ends);
          thread15339(tdone,ends);
          thread15340(tdone,ends);
          int biggest15350 = 0;
          if(ends[2]>=biggest15350){
            biggest15350=ends[2];
          }
          if(ends[3]>=biggest15350){
            biggest15350=ends[3];
          }
          if(ends[4]>=biggest15350){
            biggest15350=ends[4];
          }
          if(ends[5]>=biggest15350){
            biggest15350=ends[5];
          }
          if(ends[6]>=biggest15350){
            biggest15350=ends[6];
          }
          if(ends[7]>=biggest15350){
            biggest15350=ends[7];
          }
          if(biggest15350 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread15351(tdone,ends);
          thread15352(tdone,ends);
          thread15353(tdone,ends);
          thread15354(tdone,ends);
          thread15355(tdone,ends);
          thread15356(tdone,ends);
          int biggest15366 = 0;
          if(ends[2]>=biggest15366){
            biggest15366=ends[2];
          }
          if(ends[3]>=biggest15366){
            biggest15366=ends[3];
          }
          if(ends[4]>=biggest15366){
            biggest15366=ends[4];
          }
          if(ends[5]>=biggest15366){
            biggest15366=ends[5];
          }
          if(ends[6]>=biggest15366){
            biggest15366=ends[6];
          }
          if(ends[7]>=biggest15366){
            biggest15366=ends[7];
          }
          if(biggest15366 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest15366 == 0){
            S15333=0;
            active[1]=0;
            ends[1]=0;
            S15333=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[1] != 0){
      int index = 1;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        if(!df){
          valveInjectorOnOff.gethook();
          valveInletOnOff.gethook();
          dosUnitValveRetract.gethook();
          dosUnitValveExtend.gethook();
          jobDone.gethook();
          enable.gethook();
          enableFiller.gethook();
          df = true;
        }
        runClockDomain();
      }
      valveInjectorOnOff.setpreclear();
      valveInletOnOff.setpreclear();
      dosUnitValveRetract.setpreclear();
      dosUnitValveExtend.setpreclear();
      jobDone.setpreclear();
      enable.setpreclear();
      enableFiller.setpreclear();
      bottleAtPos2.setpreclear();
      dosUnitEvac.setpreclear();
      dosUnitFilled.setpreclear();
      injectorOn.setpreclear();
      injectorOff.setpreclear();
      inletOn.setpreclear();
      inletOff.setpreclear();
      jobDoneN.setpreclear();
      bottleAtPos2E.setpreclear();
      dosUnitEvacE.setpreclear();
      dosUnitFilledE.setpreclear();
      injectorOnE.setpreclear();
      injectorOffE.setpreclear();
      inletOnE.setpreclear();
      inletOffE.setpreclear();
      jobDoneE.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = valveInjectorOnOff.getStatus() ? valveInjectorOnOff.setprepresent() : valveInjectorOnOff.setpreclear();
      valveInjectorOnOff.setpreval(valveInjectorOnOff.getValue());
      valveInjectorOnOff.setClear();
      dummyint = valveInletOnOff.getStatus() ? valveInletOnOff.setprepresent() : valveInletOnOff.setpreclear();
      valveInletOnOff.setpreval(valveInletOnOff.getValue());
      valveInletOnOff.setClear();
      dummyint = dosUnitValveRetract.getStatus() ? dosUnitValveRetract.setprepresent() : dosUnitValveRetract.setpreclear();
      dosUnitValveRetract.setpreval(dosUnitValveRetract.getValue());
      dosUnitValveRetract.setClear();
      dummyint = dosUnitValveExtend.getStatus() ? dosUnitValveExtend.setprepresent() : dosUnitValveExtend.setpreclear();
      dosUnitValveExtend.setpreval(dosUnitValveExtend.getValue());
      dosUnitValveExtend.setClear();
      dummyint = jobDone.getStatus() ? jobDone.setprepresent() : jobDone.setpreclear();
      jobDone.setpreval(jobDone.getValue());
      jobDone.setClear();
      dummyint = enable.getStatus() ? enable.setprepresent() : enable.setpreclear();
      enable.setpreval(enable.getValue());
      enable.setClear();
      dummyint = enableFiller.getStatus() ? enableFiller.setprepresent() : enableFiller.setpreclear();
      enableFiller.setpreval(enableFiller.getValue());
      enableFiller.setClear();
      bottleAtPos2.sethook();
      bottleAtPos2.setClear();
      dosUnitEvac.sethook();
      dosUnitEvac.setClear();
      dosUnitFilled.sethook();
      dosUnitFilled.setClear();
      injectorOn.sethook();
      injectorOn.setClear();
      injectorOff.sethook();
      injectorOff.setClear();
      inletOn.sethook();
      inletOn.setClear();
      inletOff.sethook();
      inletOff.setClear();
      jobDoneN.sethook();
      jobDoneN.setClear();
      bottleAtPos2E.sethook();
      bottleAtPos2E.setClear();
      dosUnitEvacE.sethook();
      dosUnitEvacE.setClear();
      dosUnitFilledE.sethook();
      dosUnitFilledE.setClear();
      injectorOnE.sethook();
      injectorOnE.setClear();
      injectorOffE.sethook();
      injectorOffE.setClear();
      inletOnE.sethook();
      inletOnE.setClear();
      inletOffE.sethook();
      inletOffE.setClear();
      jobDoneE.sethook();
      jobDoneE.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        valveInjectorOnOff.gethook();
        valveInletOnOff.gethook();
        dosUnitValveRetract.gethook();
        dosUnitValveExtend.gethook();
        jobDone.gethook();
        enable.gethook();
        enableFiller.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
