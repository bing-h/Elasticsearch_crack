ES_HOME="/usr/share/elasticsearch"
ES_JAR=$(cd $ES_HOME && ls lib/elasticsearch-[0-9]*.jar)
ESCORE_JAR=$(cd $ES_HOME && ls lib/elasticsearch-core-*.jar)
LUCENE_JAR=$(cd $ES_HOME && ls lib/lucene-core-*.jar)
X_CONTENT_JAR=$(cd $ES_HOME && ls lib/elasticsearch-x-content-7.8.0.jar)
XPACK_JAR=$(cd $ES_HOME && ls modules/x-pack-core/x-pack-core-*.jar)

javac -cp "${ES_HOME}/${ES_JAR}:${ES_HOME}/${LUCENE_JAR}:${ES_HOME}/${XPACK_JAR}:${ES_HOME}/${ESCORE_JAR}:${ES_HOME}/${X_CONTENT_JAR}" LicenseVerifier.java
mkdir -p  org/elasticsearch/license/
mv LicenseVerifier.class org/elasticsearch/license/
sudo cp "${ES_HOME}/${XPACK_JAR}" .
jar uvf x-pack-core-7.8.0.jar org/elasticsearch/license/LicenseVerifier.class