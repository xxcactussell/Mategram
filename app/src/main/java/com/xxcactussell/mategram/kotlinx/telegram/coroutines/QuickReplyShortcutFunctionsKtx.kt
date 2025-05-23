//
// NOTE: THIS FILE IS AUTO-GENERATED by the "TdApiKtxGenerator".kt
// See: https://github.com/tdlibx/td-ktx-generator/
//
package com.xxcactussell.mategram.kotlinx.telegram.coroutines

import kotlin.Int
import kotlin.IntArray
import kotlin.String
import com.xxcactussell.mategram.kotlinx.telegram.core.TelegramFlow
import org.drinkless.tdlib.TdApi

/**
 * Suspend function, which checks validness of a name for a quick reply shortcut. Can be called
 * synchronously.
 *
 * @param name The name of the shortcut; 1-32 characters.
 */
suspend fun TelegramFlow.checkQuickReplyShortcutName(name: String?) =
    this.sendFunctionLaunch(TdApi.CheckQuickReplyShortcutName(name))

/**
 * Suspend function, which deletes a quick reply shortcut.
 *
 * @param shortcutId Unique identifier of the quick reply shortcut.
 */
suspend fun TelegramFlow.deleteQuickReplyShortcut(shortcutId: Int) =
    this.sendFunctionLaunch(TdApi.DeleteQuickReplyShortcut(shortcutId))

/**
 * Suspend function, which loads quick reply shortcuts created by the current user. The loaded data
 * will be sent through updateQuickReplyShortcut and updateQuickReplyShortcuts.
 */
suspend fun TelegramFlow.loadQuickReplyShortcuts() =
    this.sendFunctionLaunch(TdApi.LoadQuickReplyShortcuts())

/**
 * Suspend function, which changes the order of quick reply shortcuts.
 *
 * @param shortcutIds The new order of quick reply shortcuts.
 */
suspend fun TelegramFlow.reorderQuickReplyShortcuts(shortcutIds: IntArray?) =
    this.sendFunctionLaunch(TdApi.ReorderQuickReplyShortcuts(shortcutIds))

/**
 * Suspend function, which changes name of a quick reply shortcut.
 *
 * @param shortcutId Unique identifier of the quick reply shortcut.  
 * @param name New name for the shortcut. Use checkQuickReplyShortcutName to check its validness.
 */
suspend fun TelegramFlow.setQuickReplyShortcutName(shortcutId: Int, name: String?) =
    this.sendFunctionLaunch(TdApi.SetQuickReplyShortcutName(shortcutId, name))
