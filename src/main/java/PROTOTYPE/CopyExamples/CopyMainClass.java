package PROTOTYPE.CopyExamples;


import PROTOTYPE.CopyExamples.DeepCopy.DeepCopy;
import PROTOTYPE.CopyExamples.DeepCopy.Name;

public class CopyMainClass {
    public static void main(String[] args) throws CloneNotSupportedException {
        //~~~~~~~~~~~~~~~~~~~~~~ SHALLOW COPY TEST ~~~~~~~~~~~~~~~~~~~~~~
        /*
        ShallowCopy s1 = new ShallowCopy(382,true);
        ShallowCopy s2 = s1;
        System.out.println("S1 "+s1);   //S1 PROTOTYPE.CopyExamples.ShallowCopy@6d03e736
        System.out.println("S2 "+s2);   //S2 PROTOTYPE.CopyExamples.ShallowCopy@6d03e736
        //S1 ShallowCopy{number=382, isStudent=true}
        //S2 ShallowCopy{number=382, isStudent=true}

        s1.setNumber(28);

        System.out.println("S1 "+s1);   //S1 PROTOTYPE.CopyExamples.ShallowCopy@6d03e736
        System.out.println("S2 "+s2);   //S2 PROTOTYPE.CopyExamples.ShallowCopy@6d03e736
        //S1 ShallowCopy{number=28, isStudent=true}
        //S2 ShallowCopy{number=28, isStudent=true}
        */

        //~~~~~~~~~~~~~~~~~~~~~~ DEEP COPY TEST ~~~~~~~~~~~~~~~~~~~~~~
        DeepCopy d1 = new DeepCopy(new Name("MAHMUT","CELIK"),123L);
        DeepCopy d2 = (DeepCopy) d1.clone();
        System.out.println("D1 "+d1);   //D1 PROTOTYPE.CopyExamples.DeepCopy.DeepCopy@6d03e736
        System.out.println("D2 "+d2);   //D2 PROTOTYPE.CopyExamples.DeepCopy.DeepCopy@568db2f2
        //D1 DeepCopy{name=Name{firstName='MAHMUT', lastName='CELIK'}, number=123}
        //D2 DeepCopy{name=Name{firstName='MAHMUT', lastName='CELIK'}, number=123}

        d1.setName(new Name("ELA","CELIK"));

        System.out.println("D1 "+d1);   //D1 PROTOTYPE.CopyExamples.DeepCopy.DeepCopy@6d03e736
        System.out.println("D2 "+d2);   //D2 PROTOTYPE.CopyExamples.DeepCopy.DeepCopy@568db2f2
        //D1 DeepCopy{name=Name{firstName='ELA', lastName='CELIK'}, number=123}
        //D2 DeepCopy{name=Name{firstName='MAHMUT', lastName='CELIK'}, number=123}


        //https://www.youtube.com/watch?v=QaCYMgyprtc
        //https://www.infoworld.com/article/2077578/java-tip-76--an-alternative-to-the-deep-copy-technique.html
    }
}
