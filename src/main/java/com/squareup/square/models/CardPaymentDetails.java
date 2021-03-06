package com.squareup.square.models;

import java.util.List;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonGetter;


/**
 * This is a model class for CardPaymentDetails type.
 */
public class CardPaymentDetails {

    /**
     * Initialization constructor.
     * @param status
     * @param card
     * @param entryMethod
     * @param cvvStatus
     * @param avsStatus
     * @param authResultCode
     * @param applicationIdentifier
     * @param applicationName
     * @param applicationCryptogram
     * @param verificationMethod
     * @param verificationResults
     * @param statementDescription
     * @param deviceDetails
     * @param errors
     */
    @JsonCreator
    public CardPaymentDetails(
            @JsonProperty("status") String status,
            @JsonProperty("card") Card card,
            @JsonProperty("entry_method") String entryMethod,
            @JsonProperty("cvv_status") String cvvStatus,
            @JsonProperty("avs_status") String avsStatus,
            @JsonProperty("auth_result_code") String authResultCode,
            @JsonProperty("application_identifier") String applicationIdentifier,
            @JsonProperty("application_name") String applicationName,
            @JsonProperty("application_cryptogram") String applicationCryptogram,
            @JsonProperty("verification_method") String verificationMethod,
            @JsonProperty("verification_results") String verificationResults,
            @JsonProperty("statement_description") String statementDescription,
            @JsonProperty("device_details") DeviceDetails deviceDetails,
            @JsonProperty("errors") List<Error> errors) {
        this.status = status;
        this.card = card;
        this.entryMethod = entryMethod;
        this.cvvStatus = cvvStatus;
        this.avsStatus = avsStatus;
        this.authResultCode = authResultCode;
        this.applicationIdentifier = applicationIdentifier;
        this.applicationName = applicationName;
        this.applicationCryptogram = applicationCryptogram;
        this.verificationMethod = verificationMethod;
        this.verificationResults = verificationResults;
        this.statementDescription = statementDescription;
        this.deviceDetails = deviceDetails;
        this.errors = errors;
    }

    private final String status;
    private final Card card;
    private final String entryMethod;
    private final String cvvStatus;
    private final String avsStatus;
    private final String authResultCode;
    private final String applicationIdentifier;
    private final String applicationName;
    private final String applicationCryptogram;
    private final String verificationMethod;
    private final String verificationResults;
    private final String statementDescription;
    private final DeviceDetails deviceDetails;
    private final List<Error> errors;
    /**
     * Getter for Status.
     * The card payment's current state. It can be one of: `AUTHORIZED`, `CAPTURED`, `VOIDED`,
     * `FAILED`.
     */
    @JsonGetter("status")
    public String getStatus() {
        return this.status;
    }

    /**
     * Getter for Card.
     * Represents the payment details of a card to be used for payments. These
     * details are determined by the `card_nonce` generated by `SqPaymentForm`.
     */
    @JsonGetter("card")
    public Card getCard() {
        return this.card;
    }

    /**
     * Getter for EntryMethod.
     * The method used to enter the card's details for the payment.  Can be
     * `KEYED`, `SWIPED`, `EMV`, `ON_FILE`, or `CONTACTLESS`.
     */
    @JsonGetter("entry_method")
    public String getEntryMethod() {
        return this.entryMethod;
    }

    /**
     * Getter for CvvStatus.
     * Status code returned from the Card Verification Value (CVV) check. Can be
     * `CVV_ACCEPTED`, `CVV_REJECTED`, `CVV_NOT_CHECKED`.
     */
    @JsonGetter("cvv_status")
    public String getCvvStatus() {
        return this.cvvStatus;
    }

    /**
     * Getter for AvsStatus.
     * Status code returned from the Address Verification System (AVS) check. Can be
     * `AVS_ACCEPTED`, `AVS_REJECTED`, `AVS_NOT_CHECKED`.
     */
    @JsonGetter("avs_status")
    public String getAvsStatus() {
        return this.avsStatus;
    }

    /**
     * Getter for AuthResultCode.
     * Status code returned by the card issuer that describes the payment's
     * authorization status.
     */
    @JsonGetter("auth_result_code")
    public String getAuthResultCode() {
        return this.authResultCode;
    }

    /**
     * Getter for ApplicationIdentifier.
     * For EMV payments, identifies the EMV application used for the payment.
     */
    @JsonGetter("application_identifier")
    public String getApplicationIdentifier() {
        return this.applicationIdentifier;
    }

    /**
     * Getter for ApplicationName.
     * For EMV payments, the human-readable name of the EMV application used for the payment.
     */
    @JsonGetter("application_name")
    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * Getter for ApplicationCryptogram.
     * For EMV payments, the cryptogram generated for the payment.
     */
    @JsonGetter("application_cryptogram")
    public String getApplicationCryptogram() {
        return this.applicationCryptogram;
    }

    /**
     * Getter for VerificationMethod.
     * For EMV payments, method used to verify the cardholder's identity.  Can be one of
     * `PIN`, `SIGNATURE`, `PIN_AND_SIGNATURE`, `ON_DEVICE`, or `NONE`.
     */
    @JsonGetter("verification_method")
    public String getVerificationMethod() {
        return this.verificationMethod;
    }

    /**
     * Getter for VerificationResults.
     * For EMV payments, the results of the cardholder verification.  Can be one of
     * `SUCCESS`, `FAILURE`, or `UNKNOWN`.
     */
    @JsonGetter("verification_results")
    public String getVerificationResults() {
        return this.verificationResults;
    }

    /**
     * Getter for StatementDescription.
     * The statement description sent to the card networks.
     * Note: The actual statement description will vary and is likely to be truncated and appended with
     * additional information on a per issuer basis.
     */
    @JsonGetter("statement_description")
    public String getStatementDescription() {
        return this.statementDescription;
    }

    /**
     * Getter for DeviceDetails.
     * Details about the device that took the payment.
     */
    @JsonGetter("device_details")
    public DeviceDetails getDeviceDetails() {
        return this.deviceDetails;
    }

    /**
     * Getter for Errors.
     * Information on errors encountered during the request.
     */
    @JsonGetter("errors")
    public List<Error> getErrors() {
        return this.errors;
    }

 
    @Override
    public int hashCode() {
        return Objects.hash(status, card, entryMethod, cvvStatus, avsStatus, authResultCode,
            applicationIdentifier, applicationName, applicationCryptogram, verificationMethod,
            verificationResults, statementDescription, deviceDetails, errors);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) {
            return true;
        }
        if(!(obj instanceof CardPaymentDetails)) {
            return false;
        }
        CardPaymentDetails cardPaymentDetails = (CardPaymentDetails) obj;
        return Objects.equals(status, cardPaymentDetails.status) &&
            Objects.equals(card, cardPaymentDetails.card) &&
            Objects.equals(entryMethod, cardPaymentDetails.entryMethod) &&
            Objects.equals(cvvStatus, cardPaymentDetails.cvvStatus) &&
            Objects.equals(avsStatus, cardPaymentDetails.avsStatus) &&
            Objects.equals(authResultCode, cardPaymentDetails.authResultCode) &&
            Objects.equals(applicationIdentifier, cardPaymentDetails.applicationIdentifier) &&
            Objects.equals(applicationName, cardPaymentDetails.applicationName) &&
            Objects.equals(applicationCryptogram, cardPaymentDetails.applicationCryptogram) &&
            Objects.equals(verificationMethod, cardPaymentDetails.verificationMethod) &&
            Objects.equals(verificationResults, cardPaymentDetails.verificationResults) &&
            Objects.equals(statementDescription, cardPaymentDetails.statementDescription) &&
            Objects.equals(deviceDetails, cardPaymentDetails.deviceDetails) &&
            Objects.equals(errors, cardPaymentDetails.errors);
    }

    /**
     * Builds a new {@link CardPaymentDetails.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CardPaymentDetails.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
            .status(getStatus())
            .card(getCard())
            .entryMethod(getEntryMethod())
            .cvvStatus(getCvvStatus())
            .avsStatus(getAvsStatus())
            .authResultCode(getAuthResultCode())
            .applicationIdentifier(getApplicationIdentifier())
            .applicationName(getApplicationName())
            .applicationCryptogram(getApplicationCryptogram())
            .verificationMethod(getVerificationMethod())
            .verificationResults(getVerificationResults())
            .statementDescription(getStatementDescription())
            .deviceDetails(getDeviceDetails())
            .errors(getErrors());
            return builder;
    }

    /**
     * Class to build instances of {@link CardPaymentDetails}
     */
    public static class Builder {
        private String status;
        private Card card;
        private String entryMethod;
        private String cvvStatus;
        private String avsStatus;
        private String authResultCode;
        private String applicationIdentifier;
        private String applicationName;
        private String applicationCryptogram;
        private String verificationMethod;
        private String verificationResults;
        private String statementDescription;
        private DeviceDetails deviceDetails;
        private List<Error> errors;

        /**
         * Initialization constructor
         */
        public Builder() {
           
        }

        /**
         * Setter for status
         * @param status
         * @return Builder
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }
        /**
         * Setter for card
         * @param card
         * @return Builder
         */
        public Builder card(Card card) {
            this.card = card;
            return this;
        }
        /**
         * Setter for entryMethod
         * @param entryMethod
         * @return Builder
         */
        public Builder entryMethod(String entryMethod) {
            this.entryMethod = entryMethod;
            return this;
        }
        /**
         * Setter for cvvStatus
         * @param cvvStatus
         * @return Builder
         */
        public Builder cvvStatus(String cvvStatus) {
            this.cvvStatus = cvvStatus;
            return this;
        }
        /**
         * Setter for avsStatus
         * @param avsStatus
         * @return Builder
         */
        public Builder avsStatus(String avsStatus) {
            this.avsStatus = avsStatus;
            return this;
        }
        /**
         * Setter for authResultCode
         * @param authResultCode
         * @return Builder
         */
        public Builder authResultCode(String authResultCode) {
            this.authResultCode = authResultCode;
            return this;
        }
        /**
         * Setter for applicationIdentifier
         * @param applicationIdentifier
         * @return Builder
         */
        public Builder applicationIdentifier(String applicationIdentifier) {
            this.applicationIdentifier = applicationIdentifier;
            return this;
        }
        /**
         * Setter for applicationName
         * @param applicationName
         * @return Builder
         */
        public Builder applicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        /**
         * Setter for applicationCryptogram
         * @param applicationCryptogram
         * @return Builder
         */
        public Builder applicationCryptogram(String applicationCryptogram) {
            this.applicationCryptogram = applicationCryptogram;
            return this;
        }
        /**
         * Setter for verificationMethod
         * @param verificationMethod
         * @return Builder
         */
        public Builder verificationMethod(String verificationMethod) {
            this.verificationMethod = verificationMethod;
            return this;
        }
        /**
         * Setter for verificationResults
         * @param verificationResults
         * @return Builder
         */
        public Builder verificationResults(String verificationResults) {
            this.verificationResults = verificationResults;
            return this;
        }
        /**
         * Setter for statementDescription
         * @param statementDescription
         * @return Builder
         */
        public Builder statementDescription(String statementDescription) {
            this.statementDescription = statementDescription;
            return this;
        }
        /**
         * Setter for deviceDetails
         * @param deviceDetails
         * @return Builder
         */
        public Builder deviceDetails(DeviceDetails deviceDetails) {
            this.deviceDetails = deviceDetails;
            return this;
        }
        /**
         * Setter for errors
         * @param errors
         * @return Builder
         */
        public Builder errors(List<Error> errors) {
            this.errors = errors;
            return this;
        }

        /**
         * Builds a new {@link CardPaymentDetails} object using the set fields.
         * @return {@link CardPaymentDetails}
         */
        public CardPaymentDetails build() {
            return new CardPaymentDetails(status,
                card,
                entryMethod,
                cvvStatus,
                avsStatus,
                authResultCode,
                applicationIdentifier,
                applicationName,
                applicationCryptogram,
                verificationMethod,
                verificationResults,
                statementDescription,
                deviceDetails,
                errors);
        }
    }
}
