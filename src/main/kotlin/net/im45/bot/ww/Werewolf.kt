package net.im45.bot.ww

import com.google.auto.service.AutoService
import net.mamoe.mirai.console.plugin.jvm.JvmPlugin
import net.mamoe.mirai.console.plugin.jvm.JvmPluginDescription
import net.mamoe.mirai.console.plugin.jvm.KotlinPlugin

@AutoService(JvmPlugin::class)
object Werewolf : KotlinPlugin(
        JvmPluginDescription(
                "net.im45.bot.ww",
                "0.1",
                "Werewolf"
        )
)