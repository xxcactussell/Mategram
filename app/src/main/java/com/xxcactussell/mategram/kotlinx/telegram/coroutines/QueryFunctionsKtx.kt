//
// NOTE: THIS FILE IS AUTO-GENERATED by the "TdApiKtxGenerator".kt
// See: https://github.com/tdlibx/td-ktx-generator/
//
package com.xxcactussell.mategram.kotlinx.telegram.coroutines

import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import com.xxcactussell.mategram.kotlinx.telegram.core.TelegramFlow
import org.drinkless.tdlib.TdApi
import org.drinkless.tdlib.TdApi.CallbackQueryAnswer
import org.drinkless.tdlib.TdApi.CallbackQueryPayload
import org.drinkless.tdlib.TdApi.InlineQueryResults
import org.drinkless.tdlib.TdApi.InlineQueryResultsButton
import org.drinkless.tdlib.TdApi.InputInlineQueryResult
import org.drinkless.tdlib.TdApi.InputMessageReplyTo
import org.drinkless.tdlib.TdApi.Location
import org.drinkless.tdlib.TdApi.Message
import org.drinkless.tdlib.TdApi.MessageSendOptions
import org.drinkless.tdlib.TdApi.QuickReplyMessage
import org.drinkless.tdlib.TdApi.SentWebAppMessage
import org.drinkless.tdlib.TdApi.ShippingOption

/**
 * Suspend function, which adds a message to a quick reply shortcut via inline bot. If shortcut
 * doesn't exist and there are less than getOption(&quot;quick_reply_shortcut_count_max&quot;)
 * shortcuts, then a new shortcut is created. The shortcut must not contain more than
 * getOption(&quot;quick_reply_shortcut_message_count_max&quot;) messages after adding the new message.
 * Returns the added message.
 *
 * @param shortcutName Name of the target shortcut.  
 * @param replyToMessageId Identifier of a quick reply message in the same shortcut to be replied;
 * pass 0 if none.  
 * @param queryId Identifier of the inline query.  
 * @param resultId Identifier of the inline query result.  
 * @param hideViaBot Pass true to hide the bot, via which the message is sent. Can be used only for
 * bots getOption(&quot;animation_search_bot_username&quot;),
 * getOption(&quot;photo_search_bot_username&quot;), and
 * getOption(&quot;venue_search_bot_username&quot;).
 *
 * @return [QuickReplyMessage] Describes a message that can be used for quick reply.
 */
suspend fun TelegramFlow.addQuickReplyShortcutInlineQueryResultMessage(
  shortcutName: String?,
  replyToMessageId: Long,
  queryId: Long,
  resultId: String?,
  hideViaBot: Boolean
): QuickReplyMessage =
    this.sendFunctionAsync(TdApi.AddQuickReplyShortcutInlineQueryResultMessage(shortcutName,
    replyToMessageId, queryId, resultId, hideViaBot))

/**
 * Suspend function, which sets the result of a callback query; for bots only.
 *
 * @param callbackQueryId Identifier of the callback query.  
 * @param text Text of the answer.  
 * @param showAlert Pass true to show an alert to the user instead of a toast notification.  
 * @param url URL to be opened.  
 * @param cacheTime Time during which the result of the query can be cached, in seconds.
 */
suspend fun TelegramFlow.answerCallbackQuery(
  callbackQueryId: Long,
  text: String?,
  showAlert: Boolean,
  url: String?,
  cacheTime: Int
) = this.sendFunctionLaunch(TdApi.AnswerCallbackQuery(callbackQueryId, text, showAlert, url,
    cacheTime))

/**
 * Suspend function, which answers a custom query; for bots only.
 *
 * @param customQueryId Identifier of a custom query.  
 * @param data JSON-serialized answer to the query.
 */
suspend fun TelegramFlow.answerCustomQuery(customQueryId: Long, data: String?) =
    this.sendFunctionLaunch(TdApi.AnswerCustomQuery(customQueryId, data))

/**
 * Suspend function, which sets the result of an inline query; for bots only.
 *
 * @param inlineQueryId Identifier of the inline query.  
 * @param isPersonal Pass true if results may be cached and returned only for the user that sent the
 * query. By default, results may be returned to any user who sends the same query.  
 * @param button Button to be shown above inline query results; pass null if none.  
 * @param results The results of the query.  
 * @param cacheTime Allowed time to cache the results of the query, in seconds.  
 * @param nextOffset Offset for the next inline query; pass an empty string if there are no more
 * results.
 */
suspend fun TelegramFlow.answerInlineQuery(
  inlineQueryId: Long,
  isPersonal: Boolean,
  button: InlineQueryResultsButton?,
  results: Array<InputInlineQueryResult>?,
  cacheTime: Int,
  nextOffset: String?
) = this.sendFunctionLaunch(TdApi.AnswerInlineQuery(inlineQueryId, isPersonal, button, results,
    cacheTime, nextOffset))

/**
 * Suspend function, which sets the result of a pre-checkout query; for bots only.
 *
 * @param preCheckoutQueryId Identifier of the pre-checkout query.  
 * @param errorMessage An error message, empty on success.
 */
suspend fun TelegramFlow.answerPreCheckoutQuery(preCheckoutQueryId: Long, errorMessage: String?) =
    this.sendFunctionLaunch(TdApi.AnswerPreCheckoutQuery(preCheckoutQueryId, errorMessage))

/**
 * Suspend function, which sets the result of a shipping query; for bots only.
 *
 * @param shippingQueryId Identifier of the shipping query.  
 * @param shippingOptions Available shipping options.  
 * @param errorMessage An error message, empty on success.
 */
suspend fun TelegramFlow.answerShippingQuery(
  shippingQueryId: Long,
  shippingOptions: Array<ShippingOption>?,
  errorMessage: String?
) = this.sendFunctionLaunch(TdApi.AnswerShippingQuery(shippingQueryId, shippingOptions,
    errorMessage))

/**
 * Suspend function, which sets the result of interaction with a Web App and sends corresponding
 * message on behalf of the user to the chat from which the query originated; for bots only.
 *
 * @param webAppQueryId Identifier of the Web App query.  
 * @param result The result of the query.
 *
 * @return [SentWebAppMessage] Information about the message sent by answerWebAppQuery.
 */
suspend fun TelegramFlow.answerWebAppQuery(webAppQueryId: String?, result: InputInlineQueryResult?):
    SentWebAppMessage = this.sendFunctionAsync(TdApi.AnswerWebAppQuery(webAppQueryId, result))

/**
 * Suspend function, which sends a callback query to a bot and returns an answer. Returns an error
 * with code 502 if the bot fails to answer the query before the query timeout expires.
 *
 * @param chatId Identifier of the chat with the message.  
 * @param messageId Identifier of the message from which the query originated. The message must not
 * be scheduled.  
 * @param payload Query payload.
 *
 * @return [CallbackQueryAnswer] Contains a bot's answer to a callback query.
 */
suspend fun TelegramFlow.getCallbackQueryAnswer(
  chatId: Long,
  messageId: Long,
  payload: CallbackQueryPayload?
): CallbackQueryAnswer = this.sendFunctionAsync(TdApi.GetCallbackQueryAnswer(chatId, messageId,
    payload))

/**
 * Suspend function, which returns information about a message with the callback button that
 * originated a callback query; for bots only.
 *
 * @param chatId Identifier of the chat the message belongs to.  
 * @param messageId Message identifier.  
 * @param callbackQueryId Identifier of the callback query.
 *
 * @return [Message] Describes a message.
 */
suspend fun TelegramFlow.getCallbackQueryMessage(
  chatId: Long,
  messageId: Long,
  callbackQueryId: Long
): Message = this.sendFunctionAsync(TdApi.GetCallbackQueryMessage(chatId, messageId,
    callbackQueryId))

/**
 * Suspend function, which sends an inline query to a bot and returns its results. Returns an error
 * with code 502 if the bot fails to answer the query before the query timeout expires.
 *
 * @param botUserId Identifier of the target bot.  
 * @param chatId Identifier of the chat where the query was sent.  
 * @param userLocation Location of the user; pass null if unknown or the bot doesn't need user's
 * location.  
 * @param query Text of the query.  
 * @param offset Offset of the first entry to return; use empty string to get the first chunk of
 * results.
 *
 * @return [InlineQueryResults] Represents the results of the inline query. Use
 * sendInlineQueryResultMessage to send the result of the query.
 */
suspend fun TelegramFlow.getInlineQueryResults(
  botUserId: Long,
  chatId: Long,
  userLocation: Location?,
  query: String?,
  offset: String?
): InlineQueryResults = this.sendFunctionAsync(TdApi.GetInlineQueryResults(botUserId, chatId,
    userLocation, query, offset))

/**
 * Suspend function, which sends the result of an inline query as a message. Returns the sent
 * message. Always clears a chat draft message.
 *
 * @param chatId Target chat.  
 * @param messageThreadId If not 0, the message thread identifier in which the message will be sent.
 *  
 * @param replyTo Information about the message or story to be replied; pass null if none.  
 * @param options Options to be used to send the message; pass null to use default options.  
 * @param queryId Identifier of the inline query.  
 * @param resultId Identifier of the inline query result.  
 * @param hideViaBot Pass true to hide the bot, via which the message is sent. Can be used only for
 * bots getOption(&quot;animation_search_bot_username&quot;),
 * getOption(&quot;photo_search_bot_username&quot;), and
 * getOption(&quot;venue_search_bot_username&quot;).
 *
 * @return [Message] Describes a message.
 */
suspend fun TelegramFlow.sendInlineQueryResultMessage(
  chatId: Long,
  messageThreadId: Long,
  replyTo: InputMessageReplyTo?,
  options: MessageSendOptions?,
  queryId: Long,
  resultId: String?,
  hideViaBot: Boolean
): Message = this.sendFunctionAsync(TdApi.SendInlineQueryResultMessage(chatId, messageThreadId,
    replyTo, options, queryId, resultId, hideViaBot))
