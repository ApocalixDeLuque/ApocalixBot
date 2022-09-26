package com.apobot.commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

import java.awt.*;

public class Reply extends ListenerAdapter {
    public void onSlashCommandInteraction(@NotNull SlashCommandInteractionEvent event) {
        if(event.getName().equals("reply")){
            if(event.getOption("tipo").getAsString().equals("embed")){
                EmbedBuilder embed = new EmbedBuilder()
                        .setTitle("Queue")
                        .setDescription("test")
                        .setColor(new Color(243, 64, 64, 1));
                event.replyEmbeds(embed.build()).queue();

            } else if(event.getOption("tipo").getAsString().equals("normal")){
                event.reply("hola").queue();
            }
        }

    }
}
