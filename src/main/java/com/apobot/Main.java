package com.apobot;

import com.apobot.commands.Reply;
import com.apobot.commands.Play;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.interactions.commands.OptionType;

import javax.security.auth.login.LoginException;

import static java.lang.Thread.sleep;

public class Main {
    public static JDA shardMan;
    public static JDABuilder builder;


    public static void main(String[] args) throws LoginException, InterruptedException {
        builder = JDABuilder
                .createDefault("MTAyMjY2MDc1NjQwNTIzNTc1NA.GCK1YQ.rDzdzr0YkbopktavMxapnAJHE3izTU8vqW4sGo")
                .addEventListeners(new Reply())
                .addEventListeners(new Play());
        builder
                .setStatus(OnlineStatus.IDLE)
                .setActivity(Activity.listening("Natanael Cano"));
        shardMan = builder.build();
        //sleep(5000);
        //shardMan.getGuildById("967529945003880548")
        //        .upsertCommand("reply", "Responde tu mensaje.")
        //        .addOption(OptionType.STRING, "tipo", "embed/normal.", true).queue();

        //shardMan.getGuildById("967529945003880548")
        //        .upsertCommand("play", "Reproduce musica a partir de un URL.")
        //        .addOption(OptionType.STRING, "url", "Link de la cancion.", true).queue();
    }
}
