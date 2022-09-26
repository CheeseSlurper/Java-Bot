package me.daemon;

import net.dv8tion.jda.api.sharding.DefaultShardManagerBuilder;

public class DiscordBot {

    public DiscordBot(){
        String token = "MTAyMzk2NzgzODU3MjEzNDQ4MA.GBeQPL.eMmR91NWMM9UJkoINScKEGaOPWvIA3U0Ew7nYc";
        DefaultShardManagerBuilder builder = DefaultShardManagerBuilder.createDefault(token);
    }

    public static void main(String[] args) {

    }
}