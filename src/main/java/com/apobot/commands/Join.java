package com.apobot.commands;

import net.dv8tion.jda.api.entities.GuildVoiceState;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.utils.WidgetUtil;
import org.jetbrains.annotations.NotNull;

public class Join extends ListenerAdapter {
    public void onSlashCommandInteraction(@NotNull SlashCommandInteractionEvent event){
        final TextChannel channel = event.getChannel().asTextChannel();
        final Member self = event.getMember();
        final GuildVoiceState selfVoiceState = self.getVoiceState();
    }
}
