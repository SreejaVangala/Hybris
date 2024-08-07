/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Aug 6, 2024, 12:16:36 AM                    ---
 * ----------------------------------------------------------------
 */
package my.bookstore.core.jalo;

import de.hybris.platform.acceleratorcms.jalo.components.SimpleBannerComponent;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.media.Media;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import my.bookstore.core.constants.BookstoreCoreConstants;

/**
 * Generated class for type {@link my.bookstore.core.jalo.CustomWcmsComponent CustomWcmsComponent}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedCustomWcmsComponent extends SimpleBannerComponent
{
	/** Qualifier of the <code>CustomWcmsComponent.headerText</code> attribute **/
	public static final String HEADERTEXT = "headerText";
	/** Qualifier of the <code>CustomWcmsComponent.button</code> attribute **/
	public static final String BUTTON = "button";
	/** Qualifier of the <code>CustomWcmsComponent.Image</code> attribute **/
	public static final String IMAGE = "Image";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(SimpleBannerComponent.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(HEADERTEXT, AttributeMode.INITIAL);
		tmp.put(BUTTON, AttributeMode.INITIAL);
		tmp.put(IMAGE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomWcmsComponent.button</code> attribute.
	 * @return the button
	 */
	public String getButton(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedCustomWcmsComponent.getButton requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, BUTTON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomWcmsComponent.button</code> attribute.
	 * @return the button
	 */
	public String getButton()
	{
		return getButton( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomWcmsComponent.button</code> attribute. 
	 * @return the localized button
	 */
	public Map<Language,String> getAllButton(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,BUTTON,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomWcmsComponent.button</code> attribute. 
	 * @return the localized button
	 */
	public Map<Language,String> getAllButton()
	{
		return getAllButton( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomWcmsComponent.button</code> attribute. 
	 * @param value the button
	 */
	public void setButton(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedCustomWcmsComponent.setButton requires a session language", 0 );
		}
		setLocalizedProperty(ctx, BUTTON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomWcmsComponent.button</code> attribute. 
	 * @param value the button
	 */
	public void setButton(final String value)
	{
		setButton( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomWcmsComponent.button</code> attribute. 
	 * @param value the button
	 */
	public void setAllButton(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,BUTTON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomWcmsComponent.button</code> attribute. 
	 * @param value the button
	 */
	public void setAllButton(final Map<Language,String> value)
	{
		setAllButton( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomWcmsComponent.headerText</code> attribute.
	 * @return the headerText
	 */
	public String getHeaderText(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedCustomWcmsComponent.getHeaderText requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, HEADERTEXT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomWcmsComponent.headerText</code> attribute.
	 * @return the headerText
	 */
	public String getHeaderText()
	{
		return getHeaderText( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomWcmsComponent.headerText</code> attribute. 
	 * @return the localized headerText
	 */
	public Map<Language,String> getAllHeaderText(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,HEADERTEXT,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomWcmsComponent.headerText</code> attribute. 
	 * @return the localized headerText
	 */
	public Map<Language,String> getAllHeaderText()
	{
		return getAllHeaderText( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomWcmsComponent.headerText</code> attribute. 
	 * @param value the headerText
	 */
	public void setHeaderText(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedCustomWcmsComponent.setHeaderText requires a session language", 0 );
		}
		setLocalizedProperty(ctx, HEADERTEXT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomWcmsComponent.headerText</code> attribute. 
	 * @param value the headerText
	 */
	public void setHeaderText(final String value)
	{
		setHeaderText( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomWcmsComponent.headerText</code> attribute. 
	 * @param value the headerText
	 */
	public void setAllHeaderText(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,HEADERTEXT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomWcmsComponent.headerText</code> attribute. 
	 * @param value the headerText
	 */
	public void setAllHeaderText(final Map<Language,String> value)
	{
		setAllHeaderText( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomWcmsComponent.Image</code> attribute.
	 * @return the Image
	 */
	public Media getImage(final SessionContext ctx)
	{
		return (Media)getProperty( ctx, IMAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomWcmsComponent.Image</code> attribute.
	 * @return the Image
	 */
	public Media getImage()
	{
		return getImage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomWcmsComponent.Image</code> attribute. 
	 * @param value the Image
	 */
	public void setImage(final SessionContext ctx, final Media value)
	{
		setProperty(ctx, IMAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomWcmsComponent.Image</code> attribute. 
	 * @param value the Image
	 */
	public void setImage(final Media value)
	{
		setImage( getSession().getSessionContext(), value );
	}
	
}
