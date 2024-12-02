{"payload":{"allShortcutsEnabled":true,"fileTree":{"Project 3354/Model":{"items":[{"name":"IncomingTransaction.java","path":"Project 3354/Model/IncomingTransaction.java","contentType":"file"},{"name":"Main.java","path":"Project 3354/Model/Main.java","contentType":"file"},{"name":"OutgoingTransaction.java","path":"Project 3354/Model/OutgoingTransaction.java","contentType":"file"},{"name":"Product.java","path":"Project 3354/Model/Product.java","contentType":"file"},{"name":"StockManager.java","path":"Project 3354/Model/StockManager.java","contentType":"file"},{"name":"Store.java","path":"Project 3354/Model/Store.java","contentType":"file"},{"name":"Transaction.java","path":"Project 3354/Model/Transaction.java","contentType":"file"},{"name":"TransactionsManager.java","path":"Project 3354/Model/TransactionsManager.java","contentType":"file"}],"totalCount":8},"Project 3354":{"items":[{"name":"Model","path":"Project 3354/Model","contentType":"directory"}],"totalCount":1},"":{"items":[{"name":"Project 3354","path":"Project 3354","contentType":"directory"},{"name":"AllItemsEnteredReport.java","path":"AllItemsEnteredReport.java","contentType":"file"}],"totalCount":2}},"fileTreeProcessingTime":7.809395,"foldersToFetch":[],"repo":{"id":7186,"defaultBranch":"main","name":"Java","ownerLogin":"s-g753","currentUserCanPush":true,"isFork":false,"isEmpty":false,"createdAt":"2023-07-06T18:42:54.000-05:00","ownerAvatar":"https://avatars.git.txstate.edu/u/3248","public":false,"private":true,"isOrgOwned":false},"symbolsExpanded":false,"treeExpanded":true,"refInfo":{"name":"main","listCacheKey":"v0:1691082405.899905","canEdit":true,"refType":"branch","currentOid":"2bb6eac128153ddfbb84614861b7fa5373bf1d59"},"path":"Project 3354/Model/TransactionsManager.java","currentUser":{"id":2062,"login":"aec168","userEmail":"aec168@txstate.edu"},"blob":{"rawLines":["import java.util.ArrayList;","import java.util.List;","import java.io.BufferedWriter;","import java.util.Map;","import java.util.HashMap;","import java.io.FileWriter;   // Import the FileWriter class","import java.io.IOException; ","//manages transaction inventory","","public class TransactionsManager {","    private List<Transaction> transactions;","","    //constructor","    public TransactionsManager() {","        transactions = new ArrayList<>();","    }","    //method for adding incoming transactions to list","    public void addIncomingTransaction(Store store, Product product, int amount) {","        Transaction transaction = new IncomingTransaction(store, product, amount);","        transactions.add(transaction);","    }","   //method for adding outgoing transaction to list","    public void addOutgoingTransaction(Store store, Product product, int numberOfItems) {","        Transaction transaction = new OutgoingTransaction(store, product, numberOfItems);","        transactions.add(transaction);","    }","","  //write transactions to file","  public void appendToFile(String fileName,String transaction) {","        try {","          BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true)); ","            writer.write(transaction);","            writer.newLine();","            writer.close();","        } catch (IOException e) {","            e.printStackTrace();","        }","        ","    }","}"],"stylingDirectives":[[{"start":0,"end":6,"cssClass":"pl-k"},{"start":7,"end":11,"cssClass":"pl-s1"},{"start":12,"end":16,"cssClass":"pl-s1"},{"start":17,"end":26,"cssClass":"pl-s1"}],[{"start":0,"end":6,"cssClass":"pl-k"},{"start":7,"end":11,"cssClass":"pl-s1"},{"start":12,"end":16,"cssClass":"pl-s1"},{"start":17,"end":21,"cssClass":"pl-s1"}],[{"start":0,"end":6,"cssClass":"pl-k"},{"start":7,"end":11,"cssClass":"pl-s1"},{"start":12,"end":14,"cssClass":"pl-s1"},{"start":15,"end":29,"cssClass":"pl-s1"}],[{"start":0,"end":6,"cssClass":"pl-k"},{"start":7,"end":11,"cssClass":"pl-s1"},{"start":12,"end":16,"cssClass":"pl-s1"},{"start":17,"end":20,"cssClass":"pl-s1"}],[{"start":0,"end":6,"cssClass":"pl-k"},{"start":7,"end":11,"cssClass":"pl-s1"},{"start":12,"end":16,"cssClass":"pl-s1"},{"start":17,"end":24,"cssClass":"pl-s1"}],[{"start":0,"end":6,"cssClass":"pl-k"},{"start":7,"end":11,"cssClass":"pl-s1"},{"start":12,"end":14,"cssClass":"pl-s1"},{"start":15,"end":25,"cssClass":"pl-s1"},{"start":29,"end":59,"cssClass":"pl-c"}],[{"start":0,"end":6,"cssClass":"pl-k"},{"start":7,"end":11,"cssClass":"pl-s1"},{"start":12,"end":14,"cssClass":"pl-s1"},{"start":15,"end":26,"cssClass":"pl-s1"}],[{"start":0,"end":31,"cssClass":"pl-c"}],[],[{"start":0,"end":6,"cssClass":"pl-k"},{"start":7,"end":12,"cssClass":"pl-k"},{"start":13,"end":32,"cssClass":"pl-smi"}],[{"start":4,"end":11,"cssClass":"pl-k"},{"start":12,"end":16,"cssClass":"pl-smi"},{"start":17,"end":28,"cssClass":"pl-smi"},{"start":30,"end":42,"cssClass":"pl-s1"}],[],[{"start":4,"end":17,"cssClass":"pl-c"}],[{"start":4,"end":10,"cssClass":"pl-k"},{"start":11,"end":30,"cssClass":"pl-smi"}],[{"start":8,"end":20,"cssClass":"pl-s1"},{"start":23,"end":26,"cssClass":"pl-k"},{"start":27,"end":36,"cssClass":"pl-smi"}],[],[{"start":4,"end":53,"cssClass":"pl-c"}],[{"start":4,"end":10,"cssClass":"pl-k"},{"start":11,"end":15,"cssClass":"pl-smi"},{"start":16,"end":38,"cssClass":"pl-en"},{"start":39,"end":44,"cssClass":"pl-smi"},{"start":45,"end":50,"cssClass":"pl-s1"},{"start":52,"end":59,"cssClass":"pl-smi"},{"start":60,"end":67,"cssClass":"pl-s1"},{"start":69,"end":72,"cssClass":"pl-smi"},{"start":73,"end":79,"cssClass":"pl-s1"}],[{"start":8,"end":19,"cssClass":"pl-smi"},{"start":20,"end":31,"cssClass":"pl-s1"},{"start":34,"end":37,"cssClass":"pl-k"},{"start":38,"end":57,"cssClass":"pl-smi"},{"start":58,"end":63,"cssClass":"pl-s1"},{"start":65,"end":72,"cssClass":"pl-s1"},{"start":74,"end":80,"cssClass":"pl-s1"}],[{"start":8,"end":20,"cssClass":"pl-s1"},{"start":21,"end":24,"cssClass":"pl-en"},{"start":25,"end":36,"cssClass":"pl-s1"}],[],[{"start":3,"end":51,"cssClass":"pl-c"}],[{"start":4,"end":10,"cssClass":"pl-k"},{"start":11,"end":15,"cssClass":"pl-smi"},{"start":16,"end":38,"cssClass":"pl-en"},{"start":39,"end":44,"cssClass":"pl-smi"},{"start":45,"end":50,"cssClass":"pl-s1"},{"start":52,"end":59,"cssClass":"pl-smi"},{"start":60,"end":67,"cssClass":"pl-s1"},{"start":69,"end":72,"cssClass":"pl-smi"},{"start":73,"end":86,"cssClass":"pl-s1"}],[{"start":8,"end":19,"cssClass":"pl-smi"},{"start":20,"end":31,"cssClass":"pl-s1"},{"start":34,"end":37,"cssClass":"pl-k"},{"start":38,"end":57,"cssClass":"pl-smi"},{"start":58,"end":63,"cssClass":"pl-s1"},{"start":65,"end":72,"cssClass":"pl-s1"},{"start":74,"end":87,"cssClass":"pl-s1"}],[{"start":8,"end":20,"cssClass":"pl-s1"},{"start":21,"end":24,"cssClass":"pl-en"},{"start":25,"end":36,"cssClass":"pl-s1"}],[],[],[{"start":2,"end":30,"cssClass":"pl-c"}],[{"start":2,"end":8,"cssClass":"pl-k"},{"start":9,"end":13,"cssClass":"pl-smi"},{"start":14,"end":26,"cssClass":"pl-en"},{"start":27,"end":33,"cssClass":"pl-smi"},{"start":34,"end":42,"cssClass":"pl-s1"},{"start":43,"end":49,"cssClass":"pl-smi"},{"start":50,"end":61,"cssClass":"pl-s1"}],[{"start":8,"end":11,"cssClass":"pl-k"}],[{"start":10,"end":24,"cssClass":"pl-smi"},{"start":25,"end":31,"cssClass":"pl-s1"},{"start":34,"end":37,"cssClass":"pl-k"},{"start":38,"end":52,"cssClass":"pl-smi"},{"start":53,"end":56,"cssClass":"pl-k"},{"start":57,"end":67,"cssClass":"pl-smi"},{"start":68,"end":76,"cssClass":"pl-s1"},{"start":78,"end":82,"cssClass":"pl-c1"}],[{"start":12,"end":18,"cssClass":"pl-s1"},{"start":19,"end":24,"cssClass":"pl-en"},{"start":25,"end":36,"cssClass":"pl-s1"}],[{"start":12,"end":18,"cssClass":"pl-s1"},{"start":19,"end":26,"cssClass":"pl-en"}],[{"start":12,"end":18,"cssClass":"pl-s1"},{"start":19,"end":24,"cssClass":"pl-en"}],[{"start":10,"end":15,"cssClass":"pl-k"},{"start":17,"end":28,"cssClass":"pl-smi"},{"start":29,"end":30,"cssClass":"pl-s1"}],[{"start":12,"end":13,"cssClass":"pl-s1"},{"start":14,"end":29,"cssClass":"pl-en"}],[],[],[],[]],"colorizedLines":null,"csv":null,"csvError":null,"dependabotInfo":{"showConfigurationBanner":false,"configFilePath":null,"networkDependabotPath":null,"dismissConfigurationNoticePath":"/settings/dismiss-notice/dependabot_configuration_notice","configurationNoticeDismissed":false},"displayName":"TransactionsManager.java","displayUrl":"https://git.txstate.edu/s-g753/Java/blob/main/Project%203354/Model/TransactionsManager.java?raw=true","headerInfo":{"blobSize":"1.33 KB","deleteTooltip":"Delete this file","editTooltip":"Edit this file","ghDesktopPath":"https://desktop.github.com","isGitLfs":false,"onBranch":true,"shortPath":"c6e0ad2","siteNavLoginPath":"/login?return_to=https%3A%2F%2Fgit.txstate.edu%2Fs-g753%2FJava%2Fblob%2Fmain%2FProject%25203354%2FModel%2FTransactionsManager.java","isCSV":false,"isRichtext":false,"toc":null,"lineInfo":{"truncatedLoc":"40","truncatedSloc":"36"},"mode":"file"},"image":false,"isCodeownersFile":null,"isPlain":false,"isValidLegacyIssueTemplate":false,"issueTemplate":null,"discussionTemplate":null,"language":"Java","languageID":181,"large":false,"planSupportInfo":{"repoIsFork":null,"repoOwnedByCurrentUser":null,"requestFullPath":"/s-g753/Java/blob/main/Project%203354/Model/TransactionsManager.java","showFreeOrgGatedFeatureMessage":null,"showPlanSupportBanner":null,"upgradeDataAttributes":null,"upgradePath":null},"publishBannersInfo":{"dismissActionNoticePath":"/settings/dismiss-notice/publish_action_from_dockerfile","releasePath":"/s-g753/Java/releases/new?marketplace=true","showPublishActionBanner":false},"rawBlobUrl":"https://git.txstate.edu/s-g753/Java/raw/main/Project%203354/Model/TransactionsManager.java","renderImageOrRaw":false,"richText":null,"renderedFileInfo":null,"shortPath":null,"symbolsEnabled":false,"tabSize":8,"topBannersInfo":{"overridingGlobalFundingFile":false,"globalPreferredFundingPath":null,"showInvalidCitationWarning":false,"citationHelpUrl":"https://docs.github.com/github/creating-cloning-and-archiving-repositories/creating-a-repository-on-github/about-citation-files","actionsOnboardingTip":null},"truncated":false,"viewable":true,"workflowRedirectUrl":null,"symbols":{"timed_out":false,"not_analyzed":true,"symbols":[]}},"copilotInfo":null,"copilotAccessAllowed":false,"csrf_tokens":{"/s-g753/Java/branches":{"post":"u2wAQS8Gb0_sGG5DIvARZ7zD9nqC8UM0SfsiLEiUozonCp1TW5mrSlsRyFXhKPoqYGrHIjLcuOjih2n-2NeE9Q"},"/repos/preferences":{"post":"prW1b70jS7vwQIwHx5D-jarTOCtmgxuTXkgFxCvMQ-eDyWD5K50dbpIjjk-tge0ImuCkkB0XmJuz4VuAo3j7XQ"}}},"title":"Java/Project 3354/Model/TransactionsManager.java at main · s-g753/Java"}