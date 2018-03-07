package com.rodrigopeleias.grapes

/**
 * Created by rodrigopeleias on 06/03/18.
 */
@Grapes(
        @Grab(group = 'org.apache.commons', module = 'commons-lang3', version = '3.4')
)
import org.apache.commons.lang3.text.WordUtils

String name = "Rorigo Peleias"
WordUtils wordUtils = new WordUtils()
wordUtils