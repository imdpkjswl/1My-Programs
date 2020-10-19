import java.util.Random;
import java.util.Scanner;

public class Leaky_Bucket_Algorithm {
    public static void main(String[] args) throws InterruptedException{

        Scanner s = new Scanner(System.in);
        Random r = new Random();
        Thread t = new Thread();

        int input_packet[], outlet_rate, bucket_size, simulation_time, packet_remaining, packets_dropped;

        System.out.println("Enter the Bucket Size");
        bucket_size = s.nextInt();

        System.out.println("Enter the Outlet Rate");
        outlet_rate = s.nextInt();

        System.out.println("Enter the Simulation Time");
        simulation_time = s.nextInt();

        input_packet = new int[simulation_time];

        for(int i = 0; i < simulation_time; i++)
        {
            input_packet[i] = ((r.nextInt(9)+1)*100);
        }

        for(int i = 0; i < simulation_time; i++)
        {
            System.out.println("Packet Size: " + input_packet[i]);
            System.out.println("Bucket Size: " + bucket_size);

            if(input_packet[i]>bucket_size)
            {
                packets_dropped = input_packet[i] - bucket_size;
                System.out.println("Packets Dropped: "+packets_dropped);
            }
            else
            {
                packets_dropped = 0;
                System.out.println("Packets Dropped: "+packets_dropped);
            }
            
            input_packet[i] = Math.min(input_packet[i],bucket_size);

            if(input_packet[i]>outlet_rate)
            {
                while((input_packet[i] - outlet_rate) >= 0)
                {
                    packet_remaining = (input_packet[i] - outlet_rate);
                    System.out.println("Packets Sent Through Bucket: " + outlet_rate+", Packets Remaining: " + packet_remaining);
                    input_packet[i] = input_packet[i] - outlet_rate;

                    if((packet_remaining<outlet_rate)&&(packet_remaining!=0))
                    {
                        packet_remaining = outlet_rate - packet_remaining;
                        System.out.println("Packets Sent Through Bucket: " + (outlet_rate - packet_remaining) +", Packets Remaining: 0");
                    }
                }
            }
            else
            {
                System.out.println("Packets Sent Through Bucket: " + input_packet[i]);
            }

            System.out.println("-----------------------------------------------------");
            t.sleep(1000);
        }
    }
}




