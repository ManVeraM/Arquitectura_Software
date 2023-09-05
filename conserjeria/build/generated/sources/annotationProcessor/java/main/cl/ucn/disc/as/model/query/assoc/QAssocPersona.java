package cl.ucn.disc.as.model.query.assoc;

import cl.ucn.disc.as.model.Persona;
import cl.ucn.disc.as.model.query.QPersona;
import io.ebean.Transaction;
import io.ebean.typequery.Generated;
import io.ebean.typequery.PInstant;
import io.ebean.typequery.PInteger;
import io.ebean.typequery.PLong;
import io.ebean.typequery.PString;
import io.ebean.typequery.TQAssocBean;
import io.ebean.typequery.TQProperty;
import io.ebean.typequery.TypeQueryBean;

/**
 * Association query bean for AssocPersona.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@Generated("io.ebean.querybean.generator")
@TypeQueryBean("v1")
public class QAssocPersona<R> extends TQAssocBean<Persona,R> {

  public PLong<R> id;
  public PLong<R> version;
  public PInstant<R> created;
  public PInstant<R> modified;
  public PInteger<R> rut;
  public PString<R> nombre;
  public PString<R> apellidos;
  public PString<R> email;
  public PString<R> telefono;

  /**
   * Eagerly fetch this association loading the specified properties.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetch(TQProperty<QPersona>... properties) {
    return fetchProperties(properties);
  }

  /**
   * Eagerly fetch this association using a 'query join' loading the specified properties.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetchQuery(TQProperty<QPersona>... properties) {
    return fetchQueryProperties(properties);
  }

  /**
   * Eagerly fetch this association using L2 cache.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetchCache(TQProperty<QPersona>... properties) {
    return fetchCacheProperties(properties);
  }

  /**
   * Use lazy loading for this association loading the specified properties.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetchLazy(TQProperty<QPersona>... properties) {
    return fetchLazyProperties(properties);
  }

  public QAssocPersona(String name, R root) {
    super(name, root);
  }

  public QAssocPersona(String name, R root, String prefix) {
    super(name, root, prefix);
  }
}
