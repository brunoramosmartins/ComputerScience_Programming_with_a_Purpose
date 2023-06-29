
// import edu.princeton.cs.algs4.*;

public class AudioCollage {

    // Returns a new array that rescales a[] by a multiplicative factor of alpha.
    public static double[] amplify(double[] a, double alpha) {
        double[] newAudio = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            newAudio[i] = alpha * a[i];
        }
        return newAudio;
    }

    // Returns a new array that is the reverse of a[].
    public static double[] reverse(double[] a) {
        double[] newAudio = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            newAudio[i] = a[a.length - i - 1];
        }
        return newAudio;
    }

    // Returns a new array that is the concatenation of a[] and b[].
    public static double[] merge(double[] a, double[] b) {
        double[] newAudio = new double[a.length + b.length];
        for (int i = 0; i < a.length + b.length; i++) {
            if (i < a.length) newAudio[i] = a[i];
            else              newAudio[i] = b[i - a.length];
        }
        return newAudio;
    }

    // Returns a new array that is the sum of a[] and b[],
    // padding the shorter arrays with trailing 0s if necessary.
    public static double[] mix(double[] a, double[] b) {
        int sizeA = a.length;
        int sizeB = b.length;
        double[] newAudio;
        if (sizeA > sizeB) { newAudio = new double[a.length]; }
        else { newAudio = new double[b.length]; }
        for (int i = 0; i < newAudio.length; i++) {
            if (i < sizeA && i < sizeB) { newAudio[i] = a[i] + b[i]; }
            else if (i >= sizeA) { newAudio[i] = b[i]; }
            else { newAudio[i] = a[i]; }
        }
        return newAudio;
    }

    // Returns a new array that changes the speed by the given factor.
    public static double[] changeSpeed(double[] a, double alpha) {
        int n = (int) (a.length / alpha);
        double[] newAudio = new double[n];
        for (int i = 0; i < n; i++) {
            newAudio[i] = a[(int) (i * alpha)];
        }
        return newAudio;
    }

    // Creates an audio collage and plays it on standard audio.
    // See below for the requirements.
    public static void main(String[] args) {
                double alpha = 1.5;
                double[] beatboxSound = StdAudio.read("beatbox.wav");
                double[] buzzerSound = StdAudio.read("buzzer.wav");
                double[] chimesSound = StdAudio.read("chimes.wav");
                double[] cowSound = StdAudio.read("cow.wav");
                double[] dialupSound = StdAudio.read("dialup.wav");
                double[] exposureSound = StdAudio.read("exposure.wav");
                double[] harpSound = StdAudio.read("harp.wav");
                double[] pianoSound = StdAudio.read("piano.wav");
                double[] scratchSound = StdAudio.read("scratch.wav");
                double[] silenceSound = StdAudio.read("silence.wav");
                double[] singerSound = StdAudio.read("singer.wav");
                
                
                
                StdAudio.play(amplify(beatboxSound, alpha));
                StdAudio.play(amplify(buzzerSound, alpha));
                StdAudio.play(reverse(pianoSound));
                StdAudio.play(reverse(scratchSound));
                StdAudio.play(merge(singerSound, beatboxSound));
                StdAudio.play(mix(cowSound, beatboxSound));
                StdAudio.play(changeSpeed(harpSound, alpha));
        }
}