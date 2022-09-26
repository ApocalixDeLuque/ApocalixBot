package com.apobot.commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.util.Objects;
import java.util.regex.Pattern;

public class Play extends ListenerAdapter {
    public void onSlashCommandInteraction(@NotNull SlashCommandInteractionEvent event) {
        if(event.getName().equals("play")){
            String url = event.getOption("url").getAsString();
            if(url.matches("^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]")){
                event.reply(url).queue();
            } else {
                EmbedBuilder embed = new EmbedBuilder()
                        .setTitle("URL no valido.")
                        .setDescription("Introduzca un link, no texto.")
                        .setColor(new Color(243, 64, 64, 1));
                event.replyEmbeds(embed.build()).queue();
            }
        }
    }
}
