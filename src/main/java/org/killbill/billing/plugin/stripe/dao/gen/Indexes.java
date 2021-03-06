/*
 * This file is generated by jOOQ.
 */
package org.killbill.billing.plugin.stripe.dao.gen;


import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;
import org.killbill.billing.plugin.stripe.dao.gen.tables.StripeHppRequests;
import org.killbill.billing.plugin.stripe.dao.gen.tables.StripePaymentMethods;
import org.killbill.billing.plugin.stripe.dao.gen.tables.StripeResponses;


/**
 * A class modelling indexes of tables of the <code>killbill</code> schema.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index STRIPE_HPP_REQUESTS_STRIPE_HPP_REQUESTS_KB_ACCOUNT_ID = Indexes0.STRIPE_HPP_REQUESTS_STRIPE_HPP_REQUESTS_KB_ACCOUNT_ID;
    public static final Index STRIPE_HPP_REQUESTS_STRIPE_HPP_REQUESTS_KB_PAYMENT_TRANSACTION_ID = Indexes0.STRIPE_HPP_REQUESTS_STRIPE_HPP_REQUESTS_KB_PAYMENT_TRANSACTION_ID;
    public static final Index STRIPE_PAYMENT_METHODS_STRIPE_PAYMENT_METHODS_STRIPE_ID = Indexes0.STRIPE_PAYMENT_METHODS_STRIPE_PAYMENT_METHODS_STRIPE_ID;
    public static final Index STRIPE_RESPONSES_STRIPE_RESPONSES_KB_PAYMENT_ID = Indexes0.STRIPE_RESPONSES_STRIPE_RESPONSES_KB_PAYMENT_ID;
    public static final Index STRIPE_RESPONSES_STRIPE_RESPONSES_KB_PAYMENT_TRANSACTION_ID = Indexes0.STRIPE_RESPONSES_STRIPE_RESPONSES_KB_PAYMENT_TRANSACTION_ID;
    public static final Index STRIPE_RESPONSES_STRIPE_RESPONSES_STRIPE_ID = Indexes0.STRIPE_RESPONSES_STRIPE_RESPONSES_STRIPE_ID;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index STRIPE_HPP_REQUESTS_STRIPE_HPP_REQUESTS_KB_ACCOUNT_ID = Internal.createIndex("stripe_hpp_requests_kb_account_id", StripeHppRequests.STRIPE_HPP_REQUESTS, new OrderField[] { StripeHppRequests.STRIPE_HPP_REQUESTS.KB_ACCOUNT_ID }, false);
        public static Index STRIPE_HPP_REQUESTS_STRIPE_HPP_REQUESTS_KB_PAYMENT_TRANSACTION_ID = Internal.createIndex("stripe_hpp_requests_kb_payment_transaction_id", StripeHppRequests.STRIPE_HPP_REQUESTS, new OrderField[] { StripeHppRequests.STRIPE_HPP_REQUESTS.KB_PAYMENT_TRANSACTION_ID }, false);
        public static Index STRIPE_PAYMENT_METHODS_STRIPE_PAYMENT_METHODS_STRIPE_ID = Internal.createIndex("stripe_payment_methods_stripe_id", StripePaymentMethods.STRIPE_PAYMENT_METHODS, new OrderField[] { StripePaymentMethods.STRIPE_PAYMENT_METHODS.STRIPE_ID }, false);
        public static Index STRIPE_RESPONSES_STRIPE_RESPONSES_KB_PAYMENT_ID = Internal.createIndex("stripe_responses_kb_payment_id", StripeResponses.STRIPE_RESPONSES, new OrderField[] { StripeResponses.STRIPE_RESPONSES.KB_PAYMENT_ID }, false);
        public static Index STRIPE_RESPONSES_STRIPE_RESPONSES_KB_PAYMENT_TRANSACTION_ID = Internal.createIndex("stripe_responses_kb_payment_transaction_id", StripeResponses.STRIPE_RESPONSES, new OrderField[] { StripeResponses.STRIPE_RESPONSES.KB_PAYMENT_TRANSACTION_ID }, false);
        public static Index STRIPE_RESPONSES_STRIPE_RESPONSES_STRIPE_ID = Internal.createIndex("stripe_responses_stripe_id", StripeResponses.STRIPE_RESPONSES, new OrderField[] { StripeResponses.STRIPE_RESPONSES.STRIPE_ID }, false);
    }
}
