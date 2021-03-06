package org.lightadmin.api.config.utils;

import org.lightadmin.core.util.Transformer;

import javax.annotation.Nullable;
import java.io.Serializable;

public interface EntityNameExtractor<F> extends Transformer<F, String>, Serializable {

    @Override
    String apply(@Nullable F input);
}