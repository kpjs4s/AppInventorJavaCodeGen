package com.google.appinventor.shared.rpc.project.youngandroid;


import com.google.appinventor.shared.storage.StorageUtil;
import com.google.appinventor.shared.youngandroid.YoungAndroidSourceAnalyzer;


/**
 * Young Android yail file node in the project tree (stored as a source file, even though it
 * is generated by the blocks editor)
 *
 * @author sharon@google.com (Sharon Perl)
 */
public final class YoungAndroidManifestNode extends YoungAndroidSourceNode {

    /**
     * Default constructor (for serialization only).
     */
    public YoungAndroidManifestNode() {
    }

    /**
     * Creates a new Young Android yail  file project node.
     *
     * @param fileId  file id
     */
    public YoungAndroidManifestNode(String fileId) {
        super(StorageUtil.basename(fileId), fileId);
    }

    public static String getManifestFileId(String qualifiedName) {
        return SRC_PREFIX + qualifiedName.replace('.', '/')
                + YoungAndroidSourceAnalyzer.XML_FILE_EXTENSION;
    }
}

